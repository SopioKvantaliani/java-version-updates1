package com.cyde.java10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {
        //Type Inference = means when compiler can define type and you don't need to mention;

        var str = "Cydeo"; //Java 10 new concept - var variable. Compiler knows the type of the variable.
        var number = 9;  //We can use var concept only for the local variables;

        byte number1 = 10;
        var number2 = 10; //var always understands as a integer;


       // var numbers33:List <Integer> = Arrays.asList(1, 2, 3, 4); compiles, don't know why







    }
}
