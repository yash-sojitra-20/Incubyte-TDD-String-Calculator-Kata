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

    @Test
    public void testTwoNumbersReturnsTheirSum() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(3, calculator.add("1,2"));
        assertEquals(9, calculator.add("4,5"));
    }

    @Test
    public void testMultipleNumbersReturnTheirSum() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(22, calculator.add("4,5,6,7"));
        assertEquals(150, calculator.add("10,20,30,40,50"));
    }

    @Test
    public void testNumbersSeparatedByNewlinesAndCommas() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(15, calculator.add("4\n5\n6"));
        assertEquals(21, calculator.add("7,8\n6"));
    }

}
