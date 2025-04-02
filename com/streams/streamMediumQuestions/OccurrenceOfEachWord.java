package com.streams.streamMediumQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Count occurrence of each word in a list */
public class OccurrenceOfEachWord {



    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        OccurrenceOfEachWord.countOccurrence(words);
    }

    private static void countOccurrence(List<String> list) {
        Map<String, Long> map =  list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
