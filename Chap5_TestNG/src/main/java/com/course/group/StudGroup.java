package com.course.group;

import com.course.testng.Animal;
import com.course.testng.Student;
import org.testng.annotations.Test;

public class StudGroup {

    Student s=new Student("jack",8,12);


    @Test(groups = "stu")
    public void getStudentAge(){
        System.out.println("年龄为"+s.getAge());
    }
    @Test(groups = "stu")
    public void getStudentName(){
        System.out.println("名字为"+s.getName());
    }
    @Test(groups = "stu")
    public void getStudentGrade(){
        System.out.println("年级为"+s.getGrade());
    }

    @Test
    public void OtherGroup(){
        System.out.println(" 在学生分组类，但不属于学生组");
    }

    Animal a=new Animal("cat",1,"小不点");
    @Test(groups = "animal")
    public void getAnimalName(){
        System.out.println("小动物名字为"+a.getName());
    }
    @Test(groups = "animal")
    public void getAnimalSub(){
        System.out.println("小动物属于"+a.getSubject()+"类");
    }



}
