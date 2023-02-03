package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor //Does not have any parameters;
@AllArgsConstructor//Has all parameters, but does not cover NoArgs;


public class Car {

    private String make;
    private int model;


    //We use here 3 type of constructor to discuss different examples.
    public Car(int model) {
        this.model = model;
    }

}
