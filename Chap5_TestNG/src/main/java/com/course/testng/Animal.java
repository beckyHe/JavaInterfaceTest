package com.course.testng;

public class Animal {

    private String subject;
    private int age;
    private String name;


    public Animal(String subject, int age, String name) {
        this.subject = subject;
        this.age = age;
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fun(){
        System.out.println("不同的功能");
    }

    public void show(){
        System.out.println(this.name+" is "+this.subject+",age is "+this.age);
    }
}
