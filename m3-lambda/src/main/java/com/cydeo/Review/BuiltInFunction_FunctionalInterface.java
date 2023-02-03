package com.cydeo.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BuiltInFunction_FunctionalInterface {
    public static void main(String[] args) {

        //Function = accepts one argument (Object) and returns value (any Object);
        //Abstract method of Functional interface Function = requires 2 generics types.
        //Function <T, R>{} T will be parameter, R will be return type we want to return;
        Function <int [], List<Integer>> convertArrayInArrayList = (arr)-> {
            List<Integer>result = new ArrayList<>();
            for (int each:arr){
                result.add(each);
            }
            return result;
        };

        int [] nums = {10, 20, 30};
         List <Integer> list = convertArrayInArrayList.apply(nums);
        System.out.println(list);


    }

}
