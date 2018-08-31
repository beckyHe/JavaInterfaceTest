package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

//    public static void main(String[] args) {
//
//        testCase2();
//
//        Animal a1=new Animal("cat",1,"miaomiao");
//        a1.show();
//
//    }
   //测试之前和整个测试完成的设置
    @BeforeTest
    public void beforeTest(){
        System.out.println("====set up test first====");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("*****Test is finished!!!!****");
    }
    //方法分层设置
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("---这是方法之前的设置：---");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("---方法已完成----");
    }
    //类加载
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类加载前设置"+this.getClass());
    }
    @AfterClass
    public void afterClass(){
        System.out.println("类加载完成"+this.getClass());
    }

    //测试套件
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件之前");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件之后");
    }
@Test
    public void testCase1(){
        Animal a1=new Animal("cat",1,"miaomiao");
        a1.show();
    }

@Test
    public static void testCase2(){
        Student s1=new Student("zhangsan",5, 12);
        Student s2=new Student("lisi",12, 15);
        s1.stuInfo();
        s2.stuInfo();
    }
}
