package com.example.calculator;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        // Single number case
        try {
            return Integer.parseInt(numbers);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + numbers);
        }
    }
}
