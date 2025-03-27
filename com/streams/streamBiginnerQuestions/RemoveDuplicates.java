package com.streams.streamBiginnerQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    private static void removeDuplicates(List<Integer> list){
        List<Integer> updatedList = list.stream()
                .distinct().toList();
        System.out.println(updatedList);
    }

    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        RemoveDuplicates.removeDuplicates(duplicateNumbers);

    }
}
