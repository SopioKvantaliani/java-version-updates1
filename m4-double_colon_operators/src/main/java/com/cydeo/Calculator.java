package com.cydeo;

public class Calculator {

    public static void findSum (int x, int y){ //Static Method
        System.out.println("Sum "+(x+y));
    }

    public void findMultiply(int x, int y){ //Instance Method
        System.out.println("Multiply "+(x*y));
    }

}
