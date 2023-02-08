package com.cydeo.TerminalOperators;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(4,5,6,7,8);
        int result = number.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        System.out.println("-------------------------------");

        //Find all number of calories
         Optional<Integer> calTotal = DishData.getAll().stream()   //Or type can be Optional <Integer>
                .map(Dish::getCalories)
                  .reduce(Integer::sum);
              //  .reduce((a,b)->a+b).get();


        System.out.println(calTotal);

        System.out.println("-------------------------------");

        //MAX AND MIN

        Optional <Integer> min = number.stream().reduce(Integer::min);
        Optional <Integer> max = number.stream().reduce(Integer::max);
        Optional <Integer> sum = number.stream().reduce(Integer::sum);

        System.out.println("Min "+min.get());
        System.out.println("Max "+max.get());
        System.out.println("Sum "+sum.get());

        //COUNT = counts elements

         long dishCount = DishData.getAll().stream().count();
         System.out.println(dishCount);




    }
}
