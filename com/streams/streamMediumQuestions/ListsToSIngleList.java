package com.streams.streamMediumQuestions;

import java.util.Arrays;
import java.util.List;

/*
Flatten a List of Lists into a Single List
 */
public class ListsToSIngleList {

    private static void singleList(List<List<Integer>> nestedList){
        List<Integer> list = nestedList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        ListsToSIngleList.singleList(nestedList);
    }
}
