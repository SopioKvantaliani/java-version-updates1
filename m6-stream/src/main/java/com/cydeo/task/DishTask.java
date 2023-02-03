package com.cydeo.task;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400) //getting all objects less then 400
                //.map(dish -> dish.getName())// getting names from object
                .map(Dish::getName) //using double column operator and lambda is the same. We can apply either one.
                .forEach(System.out::println);
        System.out.println("------------------------------");
        //print the length of the name of each dish
        DishData.getAll().stream()
                .map(dish -> dish.getName().length()) //whenever we say "each" dish, we need "map".
                //.map(Dish::getName) gives the each name of the dish object
                //.map (String::length) gives the length of the String.
                .forEach(System.out::println);
        System.out.println("------------------------------");
        //print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("------------------------------");
        //print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                //comparing () method; This method is taking function.
                //comparing () - When we want to put function, which means we give parameter and return value
                .sorted(Comparator.comparing(Dish::getCalories)) //sort based on calories;
                //.sorted(Comparator.comparing(Dish::getCalories).reversed()) if we add reverse() method, we'll sort descending order
                .map(Dish::getName)
                .forEach(System.out::println);
                //if you put semi-column after map, means stream is flowing, not finish.
                //We need to finish stream using .foreach()
        System.out.println("------------------------------");
        DishData.getAll().stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed()) //Descending order. Sorting based on calories
                .forEach(System.out::println);
        System.out.println("------------------------------");
        DishData.getAll().stream()
                .sorted(Comparator.comparing(Dish::getCalories)) //Ascending order. Sorting based on calories
                .forEach(System.out::println);

        // DishData.getAll().stream() - We have full Stream in the flow
        //.filter(dish -> dish.getCalories()<400) - We have only dishes less than 400 calories in the Stream, other data is gone;
        //

    }
}
