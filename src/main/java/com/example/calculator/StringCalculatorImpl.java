package com.example.calculator;

import java.util.regex.Pattern;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiter = "[,\n]";  // default: comma or newline

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            if (delimiterEndIndex != -1) {
                delimiter = Pattern.quote(numbers.substring(2, delimiterEndIndex));
                numbers = numbers.substring(delimiterEndIndex + 1);
            }
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part.trim());
            }
        }
        return sum;
    }


}
