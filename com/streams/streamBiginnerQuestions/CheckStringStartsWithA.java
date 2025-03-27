package com.streams.streamBiginnerQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckStringStartsWithA {

    private static void check(List<String> list){
        boolean b = list.stream()
                .anyMatch(s -> s!= null && s.toUpperCase().startsWith("A"));
        System.out.println(b);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "the", "catr", "elephant", "dog");
        CheckStringStartsWithA.check(list);
    }
}
