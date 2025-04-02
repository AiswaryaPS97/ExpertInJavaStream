package com.streams.streamScenarioPart1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamScenarioPart1 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 7, 3, 4, 5, 2, 3, 6, 7, 8, 8);

        //Remove duplicates
        List<Integer> uniqueList = numbers.stream()
                .distinct()
                .toList();
        System.out.println(uniqueList);



        List<Integer> salaries = List.of(3000,9000, 5000, 7000, 9000, 5000);

        //Find second highest salary
        Integer salary = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(salary);

        numbers = List.of(2, 4, 6, 7, 10); // List contains one odd number

        //List contains only even numbers
        Boolean allEven = numbers.stream().allMatch(a -> a%2 == 0);
        System.out.println(allEven);

        //List does not contain any odd numbers
        Boolean noOddNumbers = numbers.stream().noneMatch(a -> a % 2 != 0);

        //List contains at least one even number
        Boolean atleastOneEven = numbers.stream().anyMatch(a -> a %2 == 0);

        System.out.println("allEven: "+allEven+" noOddNumbers: "+noOddNumbers+" hasEven: "+atleastOneEven);



    }
}
