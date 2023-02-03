package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        //Student in the list is generic. why? This list can accept afterward any data. eg. Integer, Student, Teacher

        studentList.add(new Student("Sophie", 101));
        studentList.add(new Student("Mike", 144));
        studentList.add(new Student("Levan", 103));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

        List <StudentForPerson> studentForPersonList = new ArrayList<>();
        studentForPersonList.add(new StudentForPerson("Liana", 56));

        printInfo(studentList);
        printInfo2(teacherList);
        printInfo2(studentList); //method printInfo2 accepts all the possible lists.
        System.out.println(getLastItem(studentList)); //passing List
        System.out.println(getLastItem(teacherList));

        System.out.println("****************************************************************************");

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfo2(studentList);
        System.out.println(obj1.getLastItem(studentList));

        System.out.println();

        //obj1.printInfo2(teacherList); if we pass teacherList it gives compile error. Because we created obj1 and there we declared studentList.

        MyUtils<Teacher> obj2 = new MyUtils<>();
        obj2.printInfo2(teacherList);
        obj2.getLastItem(teacherList); //now we can pass "teacherList" because we created method with "Teacher".

        System.out.println("****************************************************************************");

        MyUtils2 <StudentForPerson> obj3 = new MyUtils2<>();
        obj3.getLastItem(studentForPersonList);

        //MyUtils2<String>obj4 = new MyUtils2<String>(); If we extend class, then List accepts only Object from the child classes.
        //Here, e.g, String isn't a extended class and gives compile error.

    }
    //Write a method that takes a list of students, prints each student and the total student count.
    public static void printInfo (List<Student> students ){ //void because we want to print info , not tu return;
        for (Student each: students){
            System.out.println(each);
        }
        System.out.println(students.size()); //count student number
    }

    //what happens if we need to use the same method with different implementation for teachers or any other groups created afterward?
    //To solve the problem we can use the power of generics here.

    //Write a method that takes a list, prints each item and the total item count.

    public static <T> void printInfo2 (List<T> list){ //why we need to put <T> after static? We need to mention in the method that T I am using in the method is my generic T.
      for (T item : list){ //
          System.out.println(item);
      }
        System.out.println(list.size()); //item is one and list is the whole list.
    }

    //Write a method that takes a list and returns the last item of the list;

    public static <T > T getLastItem (List<T> list){ //We can put any letters instead of T, but then all the T should be same letter.
        //
        return list.get(list.size()-1); //Get last item of the list;
    }

}

/*
<T> this is generic sign. It means Type;
Functional Interface: contains one abstract method;
The "T" you put in the functional interface and abstract method will be initialized as soon as we implement the method and instead of "T" put any type of Non Primitives;
Lambda expression ->
functional interface and Lambda expression can be used together in the same method = e.g generic <Integer> and (a)-> Lambda after equal sign;

example:

public interface MyFunction <T>{

void function (T n); //abstract method, accepts object and does not return anything

}

public class Test {
public static void main (String [] args ){

MyFunction<Integer>displayCube = (a)-> { //new implementation of abstract method
System.out.println (a*a*a);

     }
     displayCube.function (n:100 ); //it will print 10 000;
  }
}

When we call "method function" through the variable name "displayCube", "T" becomes Integer;
Whatever type we pass in generics, Lambda variable became exactly the same. In the above example, a is Integer. If
we put String (<String>), then we can treat "a" as a String and use all the String methods.

Behavior Parameterization steps (Generics);
1.create interface (can be functional or non functional)
2. create abstract methods
3. create classes to implement that interface and override the abstract method
4.create objects and call your methods under main method



 */
