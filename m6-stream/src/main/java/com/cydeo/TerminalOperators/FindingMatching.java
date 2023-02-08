package com.cydeo.TerminalOperators;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class FindingMatching {
    public static void main(String[] args) {

        //ALL MATCH = if all the element is matching
        //In the stream check all the data returning 1000; But all of them needs to match with my condition.
        //if one of them does not match result will be false;
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("------------------------");

        //ANY MATCH= if any of elements matching return true;
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("------------------------");

        //NONE MATCH = if no elements match
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >=1000);
        System.out.println(isHealthy2);

        System.out.println("------------------------");

        //FIND ANY = We will do some action and return  any of the elements, random one.
        //e.g. if there is no vegetarian dish, findAny() method will gie us null pointer exception.
        //to prevent null pointer exception Java people come up the solution Optional Class.
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("------------------------");

        //FIND FIRST
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async = creating multi-threads )
        System.out.println(IntStream.range(0,100).parallel().findAny()); //output = any random number
        System.out.println(IntStream.range(0,100).parallel().findFirst()); //output = 0
        //.get() =is method in Optional class and gives output without printing Optional word.
        //to use .get() method we need to assign Type Optional.

        System.out.println("------------------------");

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        //take this list, put in the stream and filter list starting with "D"
        //take this list, put in the stream and filter list starting with "J"
       Optional<String> findFirst = list1.stream().parallel().filter(s->s.startsWith("D")).findFirst();
       Optional<String> findFirst2= list1.stream().filter(s->s.startsWith("D")).findFirst();
       Optional<String> findAny = list2.stream().parallel().filter(s->s.startsWith("J")).findAny();
        Optional<String> findAny2 = list2.stream().filter(s->s.startsWith("J")).findAny();
        System.out.println(findFirst.get()+" findFirstParallel");
        System.out.println(findAny.get()+ " findAnyParallel");
        System.out.println(findFirst2.get()+" findFirst2");
        System.out.println(findAny2.get()+" findAny2");

        System.out.println("------------------------");

        //MIN AND MAX = returns Max and Min data

        Optional<Dish> dishMin= DishData.getAll().stream().min(comparing(Dish::getCalories));
        System.out.println(dishMin.get()+ " Min Caloric Dish");

        Optional <Dish> dishMax= DishData.getAll().stream().max(comparing(Dish::getCalories));
        System.out.println(dishMax.get()+" Max Caloric Dish");

        //STREAM.REDUCE = returns total numbers of the list.
        //e.g Stream.Reduce () method can be used when we want to count company's whole salary;
        //reduce(0, (a,b)->a+b) - 0 is initial value, and it assigns to "a", "b" assign to the second element.
        //if we don't type 0, it will understand that there is 0. So it's optional to write zero.



    }
}
