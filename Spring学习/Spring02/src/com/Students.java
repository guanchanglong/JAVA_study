package com;

public class Students {
    private String name;
    private String sex;
    private int age;

    public Students(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
