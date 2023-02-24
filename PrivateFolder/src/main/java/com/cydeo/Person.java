package com.cydeo;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Override the hashCode method to generate a hash code value based on the name and age fields
    @Override
    public int hashCode() {
        int result =17; // initialize with a prime number
        result = 31 * result + name.hashCode(); // add the name field to the result
        result = 31 * result + age; // add the age field to the result
        return result;
    }
}