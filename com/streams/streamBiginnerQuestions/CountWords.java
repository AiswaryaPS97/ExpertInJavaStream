package com.streams.streamBiginnerQuestions;

import java.util.Arrays;
import java.util.List;

//Count Words with Length > 3
public class CountWords {

    private static void count(List<String> list){
        long count = list.stream()
                .filter(word -> word.length() > 3)
                .count();
        System.out.println(count);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "the", "catr", "elephant", "dog");
        CountWords.count(list);
    }
}
