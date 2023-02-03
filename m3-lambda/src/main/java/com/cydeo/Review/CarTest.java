package com.cydeo.Review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        List <Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 210, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        CarPredicate newCarPredicate = (car) -> {  //We don't need any access modifiers here
            return car.getYear()>2015; //don't forget semi column;
        };
        System.out.println("New Cars");
        System.out.println(filter(carList,newCarPredicate));


        CarPredicate fastCarPredicate = car -> { //
            return car.getTopSpeed()>150;
        };
        System.out.println("Fast Cars");
        System.out.println(filter(carList,fastCarPredicate));
       // System.out.println(filter(carList, car -> car.getTopSpeed()>150)); = this is another way writing and printing Lambda, We can directly pass in print statement.


        //If we have one line code, we don't need to use curly braces and return type. We can remove from above example.








    }




//    private static List <Car> filterFasCars (List<Car> cars){    BAD Way TO DO; Instead We need to use Lambda;
//        List<Car> filteredCars = new ArrayList<>();
//
//        for (Car car:cars){
//            if (car.getTopSpeed()>160){
//                filteredCars.add(car);
//            }
//        }
//        return filteredCars;
//    }
//
//    private static List <Car> filterNewCars (List<Car> cars){
//        List<Car> filteredNewCars = new ArrayList<>();
//
//        for (Car car:cars){
//            if (car.getTopSpeed()>160){
//                filteredNewCars.add(car);
//            }
//        }
//        return filteredNewCars;
//    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;

    }

}

