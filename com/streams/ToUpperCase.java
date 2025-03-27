package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Convert List of Strings to Uppercase.

Streams.toList() - returns immutable elements - from java 16
Streams.collect(Collectors.toList()) - returns mutable elements
 */
public class ToUpperCase {

    private static void toUpperCase(List<String> words){
        List<String> upperCase = words.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase).toList();

        System.out.println(upperCase);
    }

    public static void main(String[] args) {
        List<String> values = Arrays.asList("Hello", "", null, "Worldd", "Java", "");
        ToUpperCase.toUpperCase(values);
    }
}
