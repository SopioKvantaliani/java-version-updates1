package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);

        //empty()- isPresent ()

        Optional <String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent()); //returns boolean; isPresent is boolean, checks if something is there or not.

                 //converts number into optional
        System.out.println(Optional.of(number).isPresent());

        System.out.println("--------------");

        number.stream().filter(x->x>100).forEach(System.out::println);

        /*if (gibNumber.ifPresent){
        return bigNumber.get()
        { else {
         This is how we need to use isPresent() method to prevent throwing directly exception; We don't want our code to stop;
        */
        //ifPresent - if condition wrong, nothing will be printed     //findAny returns optional
        Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println);

//        //get()
//        System.out.println(bigNumber.get());

        //orElse ()
        System.out.println(bigNumber.orElse(5)); //if there is no any condition existing, give us default value 5;


    }
}
