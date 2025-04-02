package com.streams.streamMediumQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatternNestedList {

    private static void flatternNestedListToSingle(List<List<Integer>> list){
        List<Integer> newList = list.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(newList);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5))
        );
        FlatternNestedList.flatternNestedListToSingle(list);
    }
}
