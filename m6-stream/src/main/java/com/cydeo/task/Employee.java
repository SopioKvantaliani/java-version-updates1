package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String>empPhoneNumbers; //Every employee has phone, but some employees can have more than one phone number;

}
