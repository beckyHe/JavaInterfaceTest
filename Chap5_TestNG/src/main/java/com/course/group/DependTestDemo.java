package com.course.group;

import org.testng.annotations.Test;

public class DependTestDemo {
    @Test
    public void test1(){
        System.out.println("这是首先执行的测试");
//        throw new RuntimeException();
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("需要测试一执行了，测试二才会被执行");
    }
}
