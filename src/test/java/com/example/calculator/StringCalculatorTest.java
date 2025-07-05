package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testCustomDelimiter() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(3, calculator.add("//;\n1;2"));
        assertEquals(9, calculator.add("//*\n2*3*4"));
        assertEquals(8, calculator.add("//#\n2#3#3"));
    }

    @Test
    public void testNegativeNumbersThrowException() {
        StringCalculator calculator = new StringCalculatorImpl();

        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3"));
        assertEquals("negative numbers not allowed: -2", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> calculator.add("-1,-3,4"));
        assertEquals("negative numbers not allowed: -1, -3", exception2.getMessage());
    }

    @Test
    public void testIgnoreNumbersGreaterThan1000() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(2, calculator.add("2,1001"));
        assertEquals(1002, calculator.add("2,1000"));
    }

    @Test
    public void testDelimiterOfAnyLength() {
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(6, calculator.add("//[***]\n1***2***3"));
        assertEquals(10, calculator.add("//[abc]\n1abc2abc3abc4"));
    }

}
