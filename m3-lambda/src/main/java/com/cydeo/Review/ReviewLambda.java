package com.cydeo.Review;

@FunctionalInterface
public interface ReviewLambda {
    void test(Integer a);

}
    /*

OOP (Object Oriented Programming)

Functional Programming

AOP (Aspect Oriented Programming)

Reactive Programming

Behavioural Parameterization = we pass object to have different implementation = Lambda

Steps and framework to create Lambda methods;
1. create interface (Functional Interface, one abstract method); You can have any number of methods in the interface, but only one abstract method and it is functional;
2. create abstract methods in the interface.
3. create classes to implement that interface and override the abstract method
4.create objects and call your methods under main method
5. -> fat arrow = we need to creat Lambda;



Behavior Parameterization steps (Generics);
1.create interface (can be functional or non functional)
2. create abstract methods
3. create classes to implement that interface and override the abstract method
4.create objects and call your methods under main method
But,
 for lambda expression there are 2 important rules:
1. Only FUNCTIONAL INTERFACE(one abstract method) can apply Lambda
2. Abstract method should have same signature with lambda
signature means==> parameter & return type of the method

Functional Interface and Lambda are correlated  with each other;
Lambda expression is a expression of Functional Interface abstract method (Single Abstract Method Interface);
Functional Interface we use not for the inheritance, we use it for different functions;
Every Functional Interface we need to include one Abstract Method; To define implementation of the method we use Lambda Expression;

Lambda Expression expresses the instances of a Functional Interface and we can assign to the Functional Interface variable;
Syntax of Lambda:
(Parameters) -> {Statement}; - Takes argument(s) and executes the given statements in lambda expression's body;
(No Parameters) -> {Statement}; - Takes no arguments and executes the given statement(s);

Syntax/Example:

@FunctionalInterface
public Interface MyInterface {
 void function (int a);  //Abstract Method

 //The only way to give implementation of this Abstract Method would be through the Lambda Expression ()->

}





     */

