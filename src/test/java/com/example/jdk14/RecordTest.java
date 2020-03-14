package com.example.jdk14;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SoftAssertionsExtension.class)
class RecordTest {

    private Point point;

    @BeforeEach
    void setUp() {
        point = new Point(5, 6);
    }

    @Test
    void shouldContainAccessors(SoftAssertions softly) {
        softly.assertThat(point.x()).isEqualTo(5);
        softly.assertThat(point.y()).isEqualTo(6);
    }

    @Test
    void shouldHaveToString() {
        assertThat(point.toString())
                .contains("Point")
                .contains("x=5")
                .contains("y=6");
    }

    @Test
    void shouldHaveEqualHashCodes() {
        var samePoint = new Point(5, 6);
        assertThat(samePoint.hashCode())
                .isGreaterThan(0)
                .isEqualTo(point.hashCode());
    }

    @Test
    void shouldBeEqual() {
        var samePoint = new Point(5, 6);
        assertThat(samePoint)
                .isNotSameAs(point)
                .isEqualTo(point);
    }

    @Nested
    class CustomCanonicalConstructor {

        @Test
        void shouldConstructIfValidArguments(SoftAssertions softly) {
            var account = new Account("1004572", AccountType.CHECKING, 42L, BigDecimal.valueOf(4_250.0));

            softly.assertThat(account.number()).isEqualTo("1004572");
            softly.assertThat(account.type()).isEqualTo(AccountType.CHECKING);
            softly.assertThat(account.ownerId()).isEqualTo(42L);
            softly.assertThat(account.balance()).isEqualTo(BigDecimal.valueOf(4_250.0));
        }

        @Test
        void shouldThrowExceptionIfMissingRequiredField(SoftAssertions softly) {
            softly.assertThatThrownBy(() -> new Account(null, AccountType.SAVINGS, 84L, BigDecimal.ZERO))
                    .isExactlyInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Account number cannot be null");

            softly.assertThatThrownBy(() -> new Account("THX-1138", null, 84L, BigDecimal.ZERO))
                    .isExactlyInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Account type cannot be null");

            softly.assertThatThrownBy(() -> new Account("12345", AccountType.SAVINGS, -64L, BigDecimal.ZERO))
                    .isExactlyInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Account ownerId must be a positive number");

            softly.assertThatThrownBy(() -> new Account("T-16SKY", AccountType.SAVINGS, 84L, BigDecimal.valueOf(-1.0)))
                    .isExactlyInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Account balance cannot be negative");
        }
    }

    @Test
    void shouldSupportCustomConstructors() {
        var account = new Account("THX-1138", AccountType.CHECKING, 8L);

        assertThat(account.balance()).isZero();
    }

    @Test
    void shouldSupportStaticFactoryMethods(SoftAssertions softly) {
        var ownerId = 42L;
        var checking = Account.newCheckingAccount("1000456", ownerId);
        softly.assertThat(checking.type()).isEqualTo(AccountType.CHECKING);
        softly.assertThat(checking.balance()).isZero();

        var savings = Account.newSavingsAccount("1000457", ownerId);
        softly.assertThat(savings.type()).isEqualTo(AccountType.SAVINGS);
        softly.assertThat(savings.balance()).isZero();
    }

    @Test
    void shouldSupportCustomMethods() {
        var checking = new Account("T-65XWING", AccountType.SAVINGS, 84L, BigDecimal.valueOf(3_500.00));

        assertThat(checking.description()).isEqualTo("SAVINGS #T-65XWING");
    }
}
