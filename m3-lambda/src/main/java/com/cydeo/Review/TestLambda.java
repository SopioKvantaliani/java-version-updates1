package com.cydeo.Review;

public class TestLambda {
    public static void main(String[] args) {

        ReviewLambda cube = (a)-> System.out.println(a*a*a);
        //ReviewLambda = Interface; cube = assigned variable; a = Parameter int; and print statement;

        cube.test(10);
        //variable.abstract method name and pass the  = to call the abstract method and give different implementation;

        System.out.println("-----------------------------------");

        ReviewLambda oddNumber = (a)-> {
            if (a %2==0){
                System.out.println(a+ " is even");
            }else {
                System.out.println(a+ " is odd");
            }
        }; //when we put couple of statement in Lambda body we use curly braces; semi column at the end of curly braces;

        oddNumber.test(6);

    }
}
