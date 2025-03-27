package com.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* Count occurrence of each word in a list */
public class OccurrenceOfEachWord {



    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        System.out.println(OccurrenceOfEachWord.countOccurrence(words));
    }

    private static Map<String,Long> countOccurrence(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }
}
