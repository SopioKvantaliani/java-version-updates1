package com.cydeo.TerminalOperators;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        //toCollection (Supplier): is used to create a Collection using Collector
        List<Integer> numbers = Arrays.asList(3, 4, 4, 5, 6, 7, 8);
         List<Integer>numberList= numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new)); //Created new ArrayList based on the logic in filter()
        System.out.println(numberList);

        System.out.println("---------------------------");

        Set<Integer> numberSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));//HashSet does not allow duplicates
        System.out.println(numberSet);

        System.out.println("---------------------------");

        //toList() : returns a Collector interface that gathers the input data into a new list
         List<Integer> numberList2 =  numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        System.out.println("---------------------------");
        //toSet(): returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberList3 =  numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberList3);

        System.out.println("---------------------------");

        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new map
        Map <String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("---------------------------");

        //summingInt(toIntFunction): returns a Collector that produces the sum of integer-valued function
         Integer sum= DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("---------------------------");

        //counting (): returns a Collector that counts the number of the elements
        //similar to .count() method from Optional class
        Long eventCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(eventCount+" Count of Numbers");


        System.out.println("---------------------------");

        //averagingInt (toIntFunction): returns the average of the integers passed values
         Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage +" calorieAverage");

        System.out.println("---------------------------");

        //joining(): is used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java", "Js", "TS");
         String str= courses.stream()
                .collect(Collectors.joining(", "));
        System.out.println(str);

        System.out.println("---------------------------");

        //partitioningBy(): is used to partition/grouping a stream of objects (or a set of elements) based on a given predicate;
        //partitioningBy() grouping is done based on boolean, true or false groups.
        Map<Boolean,List<Dish>>veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        System.out.println("---------------------------");
        //groupingBy(): is used for grouping object by some property and storing results in a Map instance
        //grouping is done based on property & value, but we can decide what exactly

         Map <Type,List<Dish>>dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);

    }
}
