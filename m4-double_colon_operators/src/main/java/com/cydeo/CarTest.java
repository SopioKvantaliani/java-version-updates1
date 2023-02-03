package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


        //1) Zero Argument Constructor
        Supplier <Car> c1 = ()-> new Car();
        System.out.println(c1.get().getModel()); //Prints default value of int

        Supplier <Car> c2 = Car :: new; //Here we call Constructor. new Key word here calls constructor.
        System.out.println(c2.get().getModel());

        //2) One argument Constructor
        Function <Integer,Car> f1 = model -> new Car(model);
        Function <Integer,Car> f2 = Car::new;

        //3) Two argument Constructor
        BiFunction <String, Integer, Car> f3 = Car::new;
        Car honda = f3.apply("Honda", 2015); //apply in BiFunction is method and returns car object;
        System.out.println(honda.getMake() +" " + honda.getMake());


    }
}
