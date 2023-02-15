package com.cyde.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOf {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> unmodifiable1 = List.of(1, 2, 3, 4); //adds elements in the new list; not in the existing list;
        List<Integer> unmodifiable = List.copyOf(numberList); //takes directly ArrayList, but is unmodifiable;
        System.out.println(unmodifiable1);
        System.out.println(unmodifiable);


    }
}
