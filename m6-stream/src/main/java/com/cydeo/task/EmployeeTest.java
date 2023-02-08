package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll()
//                .map(employee -> employee.getEmpEmail()) We can use Lambda as well.
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        //Print all phoneNumbers; Print Separate phones and returns Stream <String>
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        //Prints all phone numbers and returns Stream List<String>
         EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

         EmployeeData.readAll()
                 .map(Employee::getEmpPhoneNumbers)
                 .flatMap(List::stream)//we call stream() method directly; why List- because we used List class, List Type.
                 .forEach(System.out::println);


    }

}

//What is double column operator = we use when we call method() directly.
