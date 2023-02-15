package com.cyde.java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TeeingMethod { //name of this method is coming from tee, which means გადამყვანი სანტეხნიკაში
    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "A", 100),
                new Employee( 2, "B", 200),
                new Employee(3, "C", 300),
                new Employee(4, "D", 400)
        );

    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}