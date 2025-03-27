package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/*
Find longest word in a list
 */
public class FindLongestWord {

    private static void findLongestWord(List<String> words){

        String result = words.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> values = Arrays.asList("Hello", "", null, "Worldd", "Java", "");
        FindLongestWord.findLongestWord(values);
    }
}
