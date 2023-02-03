package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PrintCharacters {
    public static void main(String[] args) {

        List <String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");
        words.stream()
                .map(str ->str.length())
                .forEach(System.out::println);


    }

}
