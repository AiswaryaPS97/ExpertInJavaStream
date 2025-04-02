package com.streams.streamMediumQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Remove null and empty values from a list
 */
public class RemoveNull {

    private static void remove(List<String> values){
//        List<String> newList = values.stream()
//                .filter(Objects::nonNull)
//                .filter(val -> !val.isEmpty())
//                .toList();
        values.removeIf(val -> val == null || val.isEmpty());
        System.out.println(values);
    }

    public static void main(String[] args) {

        /*
        Arrays.asList() is immutable, so using removeIf will create issue.
         */
//        List<String> values = Arrays.asList("Hello", "", null, "World", "Java", "");
        List<String> values = new ArrayList<>(Arrays.asList("Hello", "", null, "World", "Java", ""));

        RemoveNull.remove(values);
    }
}
