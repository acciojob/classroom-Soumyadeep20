package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }
    public Teacher(String name,int numberOfStudents, int age)
    {
        this.name=name;
        this.age=age;
        this.numberOfStudents=numberOfStudents;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
