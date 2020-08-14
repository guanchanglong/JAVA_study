package com;

public class Car1 {
    private String name;

    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car1 [name=" + name + ", price=" + price + "]";
    }
}
