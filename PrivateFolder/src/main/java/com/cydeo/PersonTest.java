package com.cydeo;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("Sophie", 37);
        Person person2 = new Person("Sophie", 37);

        System.out.println(person1.hashCode());


    }
}
