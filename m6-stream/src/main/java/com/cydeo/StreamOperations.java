package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List <Integer> list = Arrays.asList(1, 2, 3, 4,4, 5, 9, 12, 14);
     //   list.forEach(x-> System.out.println(x));

        //FILTER
        list.stream()
                .filter(i-> i%2==0) //manipulation = filters
                .forEach(System.out :: println); //Stream is done here. Since we use forEach Stream is done.

        //DISTINCT = Unique Characters
        Stream<Integer> str = list.stream() //Stream<Integer> str is Stream, referencing list Stream.
                .filter(i-> i%2 ==0) //intermident operation
                .distinct(); ////intermident operation
                str.forEach(System.out::println); //ends stream.

        System.out.println("----------------------");

        //LIST = number of elements we limit to print
        list.stream()
                .filter(i-> i%2!=0)
                .limit(2) //shows number of elements you limit.
                .forEach(System.out::println);

        System.out.println("----------------------");

        //SKIP the element, e.g 1 element, 2 element ect.
        list.stream()
                .filter(i-> i%2!=0)
                .skip(2) //shows number of elements you limit.
                .forEach(System.out::println);

        System.out.println("----------------------");

        //MAP - this operation takes a function as argument. Function is applied to each element, mapping it to a new element
        list.stream()
                .map(number->number*2)
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("----------------------");


    }
}
