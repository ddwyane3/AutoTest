package com.wade.testNg.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by admin on 2018/7/16.
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTesst(){
        System.out.println("after test ");
    }
}
