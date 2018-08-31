package com.course.testng;

public class Student {

    private String name;
    private int Grade;
    private int age;

    public Student(String name, int grade, int age) {
        this.name = name;
        Grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void stuInfo(){
        System.out.println(this.name+",年纪为"+this.age+"，在年级"+this.Grade);
    }
}
