package com.streams.streamBiginnerQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {

    private static void filterEven(List<Integer> nums){
//        List<Integer> evenList = nums.stream()
//                .filter(num -> num % 2 == 0)
//                .toList();
//        System.out.println(evenList);
        nums.removeIf(num -> num % 2 != 0);
        System.out.println(nums);
    }

    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        FilterEvenNumbers.filterEven(nums);
    }
}
