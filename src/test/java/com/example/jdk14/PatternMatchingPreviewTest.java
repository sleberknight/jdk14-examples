package com.example.jdk14;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@DisplayName("JDK 14 Pattern Matching Preview")
@ExtendWith(SoftAssertionsExtension.class)
class PatternMatchingPreviewTest {

    @Test
    void shouldSupportEnhancedInstanceOf(SoftAssertions softly) {
        var stringResult = handle("some text");
        softly.assertThat(stringResult).isEqualTo("some text (length: 9)");

        var intResult = handle(42);
        softly.assertThat(intResult).isEqualTo("42");
    }

    private String handle(Object event) {
        if (event instanceof String str){
            return "%s (length: %d)".formatted(str, str.length());
        }

        return event.toString();
    }

    @Test
    void shouldSupportUsingDeclaredVariableImmediately(SoftAssertions softly) {
        softly.assertThat(capitalizeRedString("quick red fox")).isEqualTo("QUICK RED FOX");
        softly.assertThat(capitalizeRedString("lazy dog")).isEqualTo("lazy dog");
        softly.assertThat(capitalizeRedString("Red dog")).isEqualTo("RED DOG");
        softly.assertThat(capitalizeRedString(42)).isEqualTo("42");
        softly.assertThat(capitalizeRedString(null)).isEqualTo("null");
    }

    private String capitalizeRedString(Object input) {
        if (input instanceof String str && str.toLowerCase().contains("red")) {
            return str.toUpperCase();
        }

        return String.valueOf(input);
    }
}
