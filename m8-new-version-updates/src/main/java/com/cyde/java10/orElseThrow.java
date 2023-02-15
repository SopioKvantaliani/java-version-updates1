package com.cyde.java10;

import java.util.Optional;

public class orElseThrow {
    public static void main(String[] args) {

        Optional<String> str = Optional.empty();
      //  System.out.println(str.get()); wrong way because we'll get exception

        //1. Instead of putting get() directly, we need to use this structure to protect code from NoSuchElementException;
        if (str.isPresent()){
            System.out.println(str.get());
        }else {
            //exception handling;
        }

        //2. Another way to catch and throw exception;
         System.out.println(str.orElseThrow()); //NoSuchElementException;
         System.out.println(str.orElseThrow(()-> new RuntimeException())); //RuntimeException

        /*
        From Optional to get return we'll use mostly orElseThrow () method;
         */

    }
}
