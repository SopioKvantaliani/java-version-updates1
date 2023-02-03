package com.cydeo.Review;

import java.util.function.BiPredicate;

public class BuiltInBiPredicate_FunctionalInterface {
    public static void main(String[] args) {

        //We pass one argument (object) and returns boolean;
        //BiPredicate <T, U> {} - T will be first Argument, U will be second Argument
        //At the end this method returns boolean;
        //boolean test (T t, U t);

        BiPredicate <Integer [], Integer> contains = (a, b) -> {
            for (Integer each: a){
                if (each ==b){
                    return true;
                }
            }
            return false; //after the loops execution if it's not true, return false.
        };

        Integer [] nums = {100, 200, 300, 400};
        boolean result = contains.test(nums,200);
        System.out.println(result);


    }
}
