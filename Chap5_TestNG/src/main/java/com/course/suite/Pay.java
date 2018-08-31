package com.course.suite;

import org.testng.annotations.Test;

public class Pay {
    @Test
    public void payTest(){
        System.out.println("Pay success,go and see your product");
    }
    @Test(enabled = false)
    public void payIgnore(){
        System.out.println(" 这是支付的忽略测试，不需要用则忽略");
    }
}
