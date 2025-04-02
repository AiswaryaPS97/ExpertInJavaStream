package com.streams.streamMediumQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortByLength {

    private static void sortStringsByLength(List<String> words){
        List<String> sortedList =  words.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(sortedList);
    }

    public static void main(String[] args) {
        List<String> values = Arrays.asList("Hello", "aiswarya", null, "Worldd", "Java", "");
        SortByLength.sortStringsByLength(values);
    }
}
