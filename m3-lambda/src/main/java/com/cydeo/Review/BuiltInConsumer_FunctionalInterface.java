package com.cydeo.Review;

import java.util.function.Consumer;

public class BuiltInConsumer_FunctionalInterface {

    public static void main(String[] args) {

        //Customer Functional Interface takes one argument and does not return any value
        //Consumer <T> {} -works with generic type

        Consumer <int []> printEach = (arr)-> {
           for (int each: arr){
               System.out.println(each);
           }
        };

        int[] arr = {1, 2, 3, 4, };
        printEach.accept(arr); //accept is the name of the ready method in Functional Interface method Consumer;
        //as long as Array is object, we can use non primitive data too.

    }
}
