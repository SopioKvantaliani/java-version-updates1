package com.cyde.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {
        //Creating unmodifiable List before Java9, means you can not change it anymore;
        List<String>courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        //courses.add("Ts");
        System.out.println(courses);

        //Creating unmodifiable List after Java9. Using List.of ()
        List<String> myCourse = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set after Java 9
        Set<String> myProducts = Set.of("Milk", "Bread", "Butter");

        //Creating unmodifiable Map after Java 9
        Map <String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung Tv", 1),
                Map.entry("Psp", 1),
                Map.entry("Char", 5)
        );

        //Unmodifiable means = when you can read only, but you can not modify anything in the Collection;




    }
}
