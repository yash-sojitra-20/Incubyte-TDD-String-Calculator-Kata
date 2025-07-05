package com.example.calculator;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part.trim());
        }
        return sum;
    }

}
