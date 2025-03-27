package com.streams.streamBiginnerQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Sorting Numbers in Descending Order
 */
public class Sorting {

    private static void sort(List<Integer> list){
        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println(sortedList);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,2,3,4);
        Sorting.sort(list);
    }
}
