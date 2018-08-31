package com.course.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("套件测试开始前准备");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("套件测试已结束");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("测试前");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("测试完成");
    }

    @BeforeGroups
    public void beforeGroup(){
        System.out.println("分组测试前");
    }
    @AfterGroups
    public void afterGroup(){
        System.out.println("分组测试结束。。。");
    }
}
