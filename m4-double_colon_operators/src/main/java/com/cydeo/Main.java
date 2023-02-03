package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

       //When I am writing my Lambda expression I am putting my implementation that belongs to the functional interface Abstract method;
       //I need to check my method signature and whenever method signature matches to abstract method I can use Functional Interface;
        //Functional Interface is interface with only one Abstract Method.
        //<> generic sign. Why? We can pass different Non-primitive data;

        //1.Type Interface
        //2.Variable name
        //3.Signature accepts 2 parameter (x,y) and returns nothing (print statement);
        //4.
        Calculate s1  =(x,y) -> System.out.println(x+y); //when one statement we might not use curly braces
        Calculate s2  =(x,y)->Calculator.findSum(x,y); //We are calling static method from the Calculator Class;
        //Implementation in lambda can be ready method, like in the example s2;

        //Reference to static method
        Calculate s3 = Calculator::findSum; //S3 is the same as S2.
        //:: is Java 8 update; Method should be Static;

        s2.calculate(10,20); //How to call the method;


        //Reference to  instance method;
        //How we can call instance method? = We need to creat Object;

        Calculator obj = new Calculator();
        Calculate s4 = obj::findMultiply; //Instance method should be called through object

        Calculate s5 = new Calculator()::findMultiply; //s4 and s5 is the same

        BiFunction <String, Integer, String> func = (str, i)-> str.substring(i);
        BiFunction <String, Integer, String> func2 = String::substring; //substring method comes from String class;
        //func and func2 is exactly same, however different way to write.
        //substring method is not static

        Function <Integer,Double> b = new MyClass()::method; //we need object to call Myclass method.
        BiFunction<MyClass,Integer,Double>b1= MyClass::method;
        //if we pass MyClass as an Object, we don't need to use new key word and creat the new object;

        /*
        Rules
        1. if you're referencing method, we check if the method is static or instance;
        2. if the method is static, directly reference with the class name;
        3. if the method is instance, directly reference with the object;
        3. if the method is instance method and the functional interface accepts the class name as an object, we don't use new key word;
         */

        Consumer<Integer> display1 = (i)-> System.out.println(i);
        Consumer<Integer> display2 = System.out::println; //System is a class and method println comes from that class;

        /*Functional Programming Meaning =  Using functions to the best effect for creating clean and maintainable software.
         - Lambda
         - double column operator
         - Generic
         */




    }
}
