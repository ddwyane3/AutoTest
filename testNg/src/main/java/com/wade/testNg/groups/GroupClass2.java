package com.wade.testNg.groups;

import org.testng.annotations.Test;

/**
 * Created by admin on 2018/7/16.
 */
@Test(groups = "stu")
public class GroupClass2 {

    public void stu1(){
        System.out.println("GroupClass2+stu1");
    }

    public void stu2(){
        System.out.println("GroupClass2+stu2");
    }
}
