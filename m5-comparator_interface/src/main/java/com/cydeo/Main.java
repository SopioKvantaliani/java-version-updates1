package com.cydeo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        Collections.sort(list); // sort method through the Collections class
        System.out.println(list);

        //Java provides us interface called Comparator;
        //Comparator helps to sort data in ascending and descending order; It compares two arguments for order;
        //Comparator.compare () = method in the Object class;
        //return -1; obj1 comes before obj2
        //return 1; obj1 comes after ojb2
        //return 0; obj1 and obj2 are equal

        //1) Ascending Order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        //2) Descending Order
        Collections.sort(list, new MyComparator()); //new MyComparator = is comparator action;
        System.out.println(list);                   //Behaviour Parameterization, which means sort() accepts Comparator Interface;
                                                    //As we have functional interface in Comparator we can directly pass action through Lambda Expression;

        //3) Sorting to Descending Order through Lambda Expression.
        Collections.sort(list, (o1,o2)->(01<02)? -1:(o1>02) ? 1:0);

        System.out.println("----------------------------------------");

        //4) Ascending order with ready method
        list.sort((o1, o2)->o1.compareTo(o2));
        System.out.println(list);

        //5) Descending order with ready method;
        list.sort((o2,o1)-> o1.compareTo(o2));
        System.out.println(list);





    }
}
