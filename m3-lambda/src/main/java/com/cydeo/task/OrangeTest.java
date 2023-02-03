package com.cydeo.task;

import com.cydeo.Color;
import com.cydeo.task.Orange;
import com.cydeo.task.OrangeFormatter;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g"; //Interface is type of Lambda (OrangeFormatter);
        //Method signature (Return Type and Object) should be same in Lambda.
        prettyPrintApple(inventory,orangeLambda);


        prettyPrintApple(inventory,orange -> "An orange of" + orange.getWeight() + "g");

        System.out.println("**************************************");

        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return  "A" + ch + " " + orange.getColor() + " orange";
        }; //why curly braces in Lambda. It's gonna be more than one statement.

        prettyPrintApple(inventory,fancyFormatter);

    }

    //Task
    //Convert to ready functional interface

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter formatter){
        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }




}
