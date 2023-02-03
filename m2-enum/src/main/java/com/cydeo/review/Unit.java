package com.cydeo.review;

public enum Unit {
    PCS("pieces"), POUNDS("pounds"), INCHES("inches"), MILES("miles");

    //without putting any values in enum we don't need to use semi column
    //if we want to declare value, we need to create value and constructor.

    public String value;

    Unit(String value) {
        this.value = value;
    }
}
