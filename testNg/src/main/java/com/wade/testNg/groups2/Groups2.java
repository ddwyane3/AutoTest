package com.wade.testNg.groups2;

import org.testng.annotations.Test;

/**
 * Created by admin on 2018/7/16.
 */
@Test(groups = "client")
public class Groups2 {

    public void test1(){
        System.out.println("Groups2 client1");
    }

    public void test2(){
        System.out.println("Groups2 client2");
    }
}
