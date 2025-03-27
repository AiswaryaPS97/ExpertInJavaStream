package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Find the First Element that Starts with 'S'
 */
public class FindElementStartsWithS {

    private static void findElement(List<String> words){
        String ele = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> word.startsWith("S"))
                        .findFirst().orElse(null);
        System.out.println(ele);
    }

    public static void main(String[] args) {
        List<String> values = Arrays.asList("Hello", "", null, "Sorldd", "Java", "");
        FindElementStartsWithS.findElement(values);
    }
}
