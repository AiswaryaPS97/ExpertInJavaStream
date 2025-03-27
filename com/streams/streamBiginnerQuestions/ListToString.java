package com.streams.streamBiginnerQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Convert List of Strings to a Single Comma-Separated String
 */
public class ListToString {

    private static void convertListToString(List<String> list){
        String s = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "i", "am", "elephant");
        ListToString.convertListToString(list);


    }
}
