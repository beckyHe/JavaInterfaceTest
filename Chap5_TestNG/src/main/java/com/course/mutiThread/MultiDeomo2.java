package com.course.mutiThread;

import org.testng.annotations.Test;

public class MultiDeomo2 {
    @Test(invocationCount = 4,threadPoolSize = 5)
    public void Mtest2(){
//        System.out.println(1);
        System.out.printf("Mtest2 Thread is %s%n",Thread.currentThread().getId());
    }
}
