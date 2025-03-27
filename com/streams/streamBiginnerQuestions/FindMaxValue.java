package com.streams.streamBiginnerQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxValue {

    private static void findMaximumValue(List<Integer> list){
        int max = list.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        FindMaxValue.findMaximumValue(duplicateNumbers);

    }
}
