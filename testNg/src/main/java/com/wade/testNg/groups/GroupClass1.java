package com.wade.testNg.groups;

import org.testng.annotations.Test;

/**
 * Created by admin on 2018/7/16.
 */
@Test(groups="stu")
public class GroupClass1 {

    public void stu1(){
        System.out.println("GroupClass1+stu1");
    }

    public void stu2(){
        System.out.println("GroupClass1+stu2");
    }
}
