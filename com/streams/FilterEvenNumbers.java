package com.streams;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {

    private static void filterEven(List<Integer> nums){
        List<Integer> evenList = nums.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println(evenList);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
        FilterEvenNumbers.filterEven(nums);
    }
}
