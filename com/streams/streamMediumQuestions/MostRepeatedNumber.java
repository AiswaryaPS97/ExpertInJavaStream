package com.streams.streamMediumQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedNumber {

    private static void findMostRepeatedNumber(List<Integer> nums){

        Integer  max = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,6,8,100,7,100,99);
        MostRepeatedNumber.findMostRepeatedNumber(list);
    }
}
