package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { //Anonymous class; new ApplePredicate is not an object, we are creating middle layer anonymous class;
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("************PREDICATE***************");
        Predicate<Integer> lesserThan2 = i -> i<20;
        Predicate<Integer> lesserThan =  i -> i<18;
        System.out.println(lesserThan.test(20)); //implementation of Lambda should be with the same signature inside the read

        System.out.println("************CONSUMER***************");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("************BI CONSUMER***************");
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(3+2); //if we pass two parameters we need parenthesis.
        addTwo.accept(1,2);

        System.out.println("************FUNCTION***************");
        Function<String,String> fun = s -> "Hello " + s; //First String is Parameter and second String is return type. Parameter = s
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************BI FUNCTION***************");
        //1st & 2nd Integers are Parameters and 3rd Integer is Return Type Object;
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));


        System.out.println("************SUPPLIER***************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        /*
        - Lambda:
            - Why we need Lambda? = Problem Portion
            - What is Lambda? = Lambda is a function, it doesn't belong to any class, you can assign it as a value.
            - How to create Lambda?
                -Functional Interface = Only one abstract method;
                -Same method signature (method signature is return type and same parameters).
            - Ready Java Functional Interfaces (Predicate, Consumer, Supplier, BI Function, Function... )
         */







































    }
}
