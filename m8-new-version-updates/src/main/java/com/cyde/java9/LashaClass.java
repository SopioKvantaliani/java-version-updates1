package com.cyde.java9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MyClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Henry", 45, Arrays.asList("Mike j.", "Anna", "Tim")),
                new Employee("Michael", 29, Arrays.asList("Sue", "Tim")),
                new Employee("Garry", 50, Arrays.asList("Mich", "Sharon"))));


        System.out.println("============== before anything:");

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(employee -> employee.age))
                .collect(Collectors.toList());


        System.out.println("============== after sort operation:");



        List<Employee> taken = sorted.stream()
                .peek(System.out::println)
                .takeWhile(employee -> employee.age < 44)
                .collect(Collectors.toList());


        System.out.println("============== after filter by age:");

        printEmployees(sorted);

    }


        public static void printEmployees (List<Employee> x){
            for (Employee employee : x) {
                System.out.println(employee.name + ", " + employee.age + ", " + employee.colleagues);
            }
        }
}
