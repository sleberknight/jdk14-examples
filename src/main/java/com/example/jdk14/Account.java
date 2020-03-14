package com.example.jdk14;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.nonNull;

import java.math.BigDecimal;

/*
  javap -p -classpath target/classes com.example.jdk14.Account
 */
public record Account(String number, AccountType type, long ownerId, BigDecimal balance) {

    public Account {
        checkArgument(nonNull(number), "Account number cannot be null");
        checkArgument(nonNull(type), "Account type cannot be null");
        checkArgument(ownerId > 0, "Account ownerId must be a positive number");
        checkArgument(balance.compareTo(BigDecimal.ZERO) > -1, "Account balance cannot be negative");
    }

    public Account(String number, AccountType type, long ownerId) {
        this(number, type, ownerId, BigDecimal.ZERO);
    }

    public static Account newCheckingAccount(String number, long ownerId) {
        return new Account(number, AccountType.CHECKING, ownerId);
    }

    public static Account newSavingsAccount(String number, long ownerId) {
        return new Account(number, AccountType.SAVINGS, ownerId);
    }

    public String description() {
        return "%s #%s".formatted(type.name(), number);
    }
}
