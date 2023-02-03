package com.cydeo.Review;

import java.util.function.Predicate;

public class BuiltInPredicate_FunctionalInterface {
    public static void main(String[] args) {

                              //one parameter a
        Predicate <Integer> isOdd = (a)->{ //type we set should be Object, no primitives;
            if (a %2!=0){
                return true;

            }else {
                return false;
            }
        };

        boolean assignToBooleanVariable = isOdd.test(100); //we can assign to new variable or directly print;

        System.out.println(assignToBooleanVariable);
        System.out.println(isOdd.test(21));

        System.out.println("---------------------");

        /*
        Find Palindrome = String equals to reverse String.
         */

        Predicate <String> isPalindrome = (a)->{
          String reverse = "";
            for (int i = a.length()-1; i >=0 ; i--) {
                reverse +=a.charAt(i); //reverse string and assign to reverse variable;
            }
            return a.equalsIgnoreCase(reverse); //return if this original String equals to reversed String;
        };

        boolean assignToBooleanVariable2= isPalindrome.test("Wooden Spoon");
        System.out.println(assignToBooleanVariable2);
    }

}
