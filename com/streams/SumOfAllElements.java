package com.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {

    private static void sum(List<Integer> list){
        int sum = list.stream()
                .reduce((n1, n2 )-> n1 + n2).orElse(0);

        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        SumOfAllElements.sum(list);
    }
}
