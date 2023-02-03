package com.cydeo.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BuiltInBiFunction_FunctionalInterface {
    public static void main(String[] args) {

        //BiFunction has the similar function as the Functional Interface;
        //Function functional interface takes 1 argument any type and returns another type
        //BiFunction accepts 2 arguments and returns a value of any type;
        //BiFunction need 2 generic types, one for argument and one for the return type;
        //BiFunction <T, U, R>{} - T & U are arguments/parameters and R is the return type;

        BiFunction<int [], int [], List<Integer>> mergeTwoArrays = (a,b)->{ //we pass 2 parameters.
            List<Integer> list = new ArrayList<>();
            for (int each:a){
                list.add(each); //we are adding array elements into ArrayList
            }

            for (int each:b){
                list.add(each);   //we are adding array elements into ArrayList
            }

            return list;
        };

        int [] arr1 = {3, 4, 5, 6, };
        int [] arr2 = {10, 20, 30, 40};

         List<Integer>result = mergeTwoArrays.apply(arr1,arr2); //we need to assign to print the result;
        System.out.println(result);


    }
}
