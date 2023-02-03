package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatStream {

    public static void main(String[] args) {

        //Creating Stream from Array
        String [] course = {"Java", "Spring", "Agile"};
        Stream<String> courseStream = Arrays.stream(course);

        //Creating Stream from Collection
        List <String> coureList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = coureList.stream();

        //Creating Stream from Collection (Separate Class)
        List<Course>myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("Ds", 101),
                new Course("MS", 102));

        Stream <Course> myCourseStream = myCourses.stream(); //.stream () method convert array into stream.

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5); //we can pass object here.



    }
}
