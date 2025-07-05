package com.example.calculator;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        if (numbers.contains(",")) {
            String[] parts = numbers.split(",");
            if (parts.length == 2) {
                return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
            }
        }

        // Single number fallback
        try {
            return Integer.parseInt(numbers);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + numbers);
        }
    }

}
