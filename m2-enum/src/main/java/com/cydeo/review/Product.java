package com.cydeo.review;


public class Product {
    public String name;
    public Unit unit;
    public String quantity;

    public Product(String name, Unit unit, String quantity) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unit=" + unit +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
