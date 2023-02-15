package com.cyde.java11;

import java.util.stream.Collectors;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "";
        var str3 = "Sophie \n Levan \n ";
        System.out.println(str.repeat(3)); //repeats string based on count your provide in the method;
        System.out.println(str.isBlank());//false - returns boolean, if string is blank or not;
        System.out.println(str2.isBlank()); //empty String true; isBlank and isNull are not the same;
        System.out.println(str.lines().collect(Collectors.toList())); //to get all the lines in a String as a Stream;
        str3.lines().forEach(System.out::println);


    }
}
