package com.cydeo;

import java.util.Comparator;

public class MyComparator implements Comparator <Integer> {


    @Override  //Descending Order
    public int compare(Integer o1, Integer o2) {
        return (01<02)? -1:(o1>02) ? 1:0;

        //Concept here is behaviour parameterization;

    }
}