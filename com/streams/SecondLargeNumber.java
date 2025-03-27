package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* find the 2nd highest number in a list */
public class SecondLargeNumber {

    private static int findSecondLarge(List<Integer> list){
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,6,8,100,7,100,99);
        System.out.println(SecondLargeNumber.findSecondLarge(list));
    }
}
