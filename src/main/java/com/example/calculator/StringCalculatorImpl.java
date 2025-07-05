package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiterRegex = "[,\n]"; // default

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            String delimiterPart = numbers.substring(2, delimiterEndIndex);

            // Support single delimiter or delimiters in brackets
            List<String> delimiters = new ArrayList<>();
            Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterPart);

            if (matcher.find()) {
                matcher.reset();
                while (matcher.find()) {
                    delimiters.add(Pattern.quote(matcher.group(1)));
                }
            } else {
                delimiters.add(Pattern.quote(delimiterPart));
            }

            delimiterRegex = String.join("|", delimiters);
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] parts = numbers.split(delimiterRegex);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                int num = Integer.parseInt(part.trim());
                if (num < 0) negatives.add(num);
                if (num <= 1000) sum += num;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " +
                    negatives.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        return sum;
    }

}
