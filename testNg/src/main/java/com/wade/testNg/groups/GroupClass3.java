package com.wade.testNg.groups;

import org.testng.annotations.Test;

/**
 * Created by admin on 2018/7/16.
 */
@Test(groups="teacher")
public class GroupClass3 {

    @Test(enabled = false)
    public void teacher1(){
        System.out.println("GroupClass3+teacher1");
    }

    public void teacher2(){
        System.out.println("GroupClass3+teacher2");
    }
}
