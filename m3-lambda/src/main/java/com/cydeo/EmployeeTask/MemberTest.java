package com.cydeo.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Mike", 35, Gender.MALE);
        Person p2 = new Person("Nodar", 22, Gender.MALE);
        Person p3 = new Person("Luke", 39, Gender.MALE);
        Person p4 = new Person("Sophie", 45, Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4); //adding individual objects in the List;
        //Create Lambda using Interface and method signature;
        CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge() >=18 && p.getAge()<=25;
        print(personList,checkMember);
        print(personList, p-> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25);
        /*
        we can directly pass Lambda in print method or we can pass parameters.
         */



    }


    private static void print (List<Person> personList, CheckMember checkMember  ){
        List<Person> result = new ArrayList<>();
        for (Person person : personList){
            if (checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }

}
