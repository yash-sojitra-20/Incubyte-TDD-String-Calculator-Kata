package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testSingleNumberReturnsItsValue() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(1, calculator.add("1"));
        assertEquals(42, calculator.add("42"));
    }

}
