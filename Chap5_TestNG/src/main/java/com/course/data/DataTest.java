package com.course.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataTest {
    @Test(dataProvider = "nameDemo")
    public void test1(String name,int age){
            System.out.println("test11==="+"名字："+name+"年龄："+age);
    }
    @Test(dataProvider = "nameDemo")
    public void test2(String name,int age){
        System.out.println("test22==="+"名字："+name+"年龄："+age);
    }

    @DataProvider(name = "nameDemo")
    public Object[][] dataProvider(Method method){
        Object[][] o=null;
        if(method.getName().equals("test1")){
              o=new Object[][]{{"赵倩",12},{"孙俪",54},{"王五",23}};
        }else
        {
            o=new Object[][]{{"jack",33},{"bob",12},{"rose",22}};
        }
        return o;
    }

}
