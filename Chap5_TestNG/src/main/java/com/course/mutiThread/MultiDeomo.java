package com.course.mutiThread;

import org.testng.annotations.Test;

public class MultiDeomo {
    @Test(invocationCount = 4,threadPoolSize = 5)
    public void Mtest1(){
//        System.out.println(1);
        System.out.printf("Mtest1 Thread is %s%n",Thread.currentThread().getId());
    }
}
