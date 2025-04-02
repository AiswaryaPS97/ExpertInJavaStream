package com.streams.streamMediumQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddGrouping {

    private static void evenOddGrouping(List<Integer> numbers){
        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println("even : " + map.get(true));
        System.out.println("odd : " + map.get(false));

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,6,8,100,7,100,99);
        EvenOddGrouping.evenOddGrouping(list);
    }
}
