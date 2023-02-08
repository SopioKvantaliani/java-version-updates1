package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        int amount3 = 200;

        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(200); //we can pass variable double, int, long...
        System.out.println(b1.subtract(b2));
        System.out.println(b1.add(b3));
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(BigDecimal.valueOf(15.56));
        System.out.println(b1.multiply(new BigDecimal("15"))); //everything is function here .add(), .subtract();
        //BigDecimal = has different methods;

        BigDecimal b4 = BigDecimal.TEN; //this TEN is not enum; its created ready numbers;
        BigDecimal b5 = BigDecimal.ONE;
        System.out.println(b4);

        //Scaling
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING)); //one digit up round;
        System.out.println(number1.setScale(1, RoundingMode.FLOOR)); //one digit down;

        //Do not use equals(). Use compareTo ()
        //use of compareTo() is sorting something, based on any logic;

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2"))); //when equals returns value 0
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("4"))); //when x>y returns value 1
        System.out.println(new BigDecimal("5").compareTo(new BigDecimal("9")));//when x<y returns value -1




    }
}

class Employee{
    private String name;
    private BigDecimal salary;
    //private double salary; We never use that after BigDecimal;
}
