package com.cydeo.review;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {

        User employee = new User("mikesmith", "Mike", "Smith", Role.EMPLOYER);
        //Why enum is called through the class name? Statics are called through the classname. As enum is static and final, which means we can call any role using Class name;
        //enum is a special class type;

        System.out.println(employee);

        System.out.println(Unit.POUNDS.value); //If enum has value, we need to call class.enum.value
        System.out.println(Arrays.toString(Unit.values())); //values() needs Array and that's why we use Arrays.toString method to print;

        //You can create any method in case you need it. But generally Enums are used simple with its basic objects

        //docs.oracle.com = theoretical content about Java

    }

}
