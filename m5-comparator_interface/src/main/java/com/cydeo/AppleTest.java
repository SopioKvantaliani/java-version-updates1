package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        //Comparator.comparing static function =
        // = accepts a sort key function and returns Comparator for the type which contains the sort key;

        //Ascending Order
        //if you want to sort any object property, you can use comparing method;
        //inside comparing method, it accepts Functional Interface (Accept one parameter and return something)
        //Here we gave parameter each apple.

        Comparator <Apple> sortApple = comparing((Apple apple)-> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        //1.We can import Comparator.comparing and here we don't need to use class name any more;
        //2.We can remove "Apple", compiler understands. We can remove;

        inventory.sort(comparing(Apple ::getWeight));
        System.out.println(inventory);

        //sort() method
        //pass to the sort() method  action/behaviour = comparing () method;
        //we can use double column operator to make it simple and short;

        //Descending Order using comparing() method
        inventory.sort(comparing(Apple ::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight) //1 - compare based on the weight; 2) Sort; 3) compare base on color;
                        .reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);

        //(Apple :: getWeight) = is simplified Lambda, using double semi column;




    }
}
