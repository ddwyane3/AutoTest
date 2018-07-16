package com.wade.testNg.groups2;

import org.testng.annotations.Test;

/**
 * Created by admin on 2018/7/16.
 */
@Test(groups = "server")
public class Groups1 {

    public void test1(){
        System.out.println("Groups1 server1");
    }

    public void test2(){
        System.out.println("Groups1 server2");
    }
}
