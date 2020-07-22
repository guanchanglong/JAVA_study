package com;

public class Classes {
    private Students students;
    public Classes(Students students){
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "students=" + students +
                '}';
    }
}
