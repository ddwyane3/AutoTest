package com.wade.testNg.groups;

import com.sun.corba.se.spi.activation.Server;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by admin on 2018/7/16.
 */
public class GroupClass4 {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试2");
    }

    @Test(groups = "server")
    public void test3(){
        System.out.println("这是服务端的测试3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试1");
    }

    @Test(groups = "client")
    public void test5(){
        System.out.println("这是客户端的测试2");
    }
    @Test(groups = "client")
    public void test6(){
        System.out.println("这是客户端的测试3");
    }

    @BeforeGroups("server")
    public void beforeOnServer(){
        System.out.println("server组之前运行的方法");
    }

    @AfterGroups("server")
    public void afterOnServer(){
        System.out.println("server组之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeOnClient(){
        System.out.println("client组之前运行的方法");
    }

    @AfterGroups("client")
    public void afterOnClient(){
        System.out.println("client组之后运行的方法");
    }
}
