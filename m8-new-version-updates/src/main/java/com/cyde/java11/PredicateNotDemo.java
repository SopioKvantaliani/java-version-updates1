package com.cyde.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Predicate<Integer>even = integer -> integer%2==0;
        Predicate<Integer>odd = integer -> integer %2!=0;
        Predicate.not(even); //New feature of Java 11, we can directly pass even and print opposite;

        List<Integer> evenNumbers = numbers.stream()
                .filter(even)  //directly we can insert Predicate even;
                .collect(Collectors.toList());


    }
}
