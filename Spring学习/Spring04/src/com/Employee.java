package com;

public class Employee {
    private String name;

    private Car1 car1;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar1(Car1 car1) {
        this.car1 = car1;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", car1=" + car1 + "]";
    }
}
