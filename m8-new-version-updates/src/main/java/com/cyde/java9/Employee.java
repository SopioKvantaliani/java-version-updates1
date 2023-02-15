package com.cyde.java9;

import java.util.List;

public class Employee {
            String name;
            int age;
            List<String> colleagues;

            public Employee(String name, int age, List<String> colleagues) {
                this.name = name;
                this.age = age;
                this.colleagues = colleagues;
            }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colleagues=" + colleagues +
                '}';
    }
}
