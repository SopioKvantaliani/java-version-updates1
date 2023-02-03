package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeTest {

       public static Stream <Employee> readAll (){
           return Stream.of(
               new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("29292929", "303030303")),
               new Employee(100, "Ozzy", "ozzy@cydeo.com", Arrays.asList("964333", "32389563")),
               new Employee(100, "Peter", "peter@cydeo.com", Arrays.asList("898989", "35678303"))
           );
       }
    }

