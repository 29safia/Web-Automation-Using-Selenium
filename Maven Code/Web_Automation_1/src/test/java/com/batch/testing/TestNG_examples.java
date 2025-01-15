package com.batch.testing;

import org.testng.annotations.*;

public class TestNG_examples {

    @AfterSuite
    public void afterSuiteExample(){
        System.out.println("After Suite Example");
    }

    @Test(priority = 1)
    public void testExample(){
        System.out.println("Test Example");
    }

    @Test(priority = 0)
    public void testExample2(){
        System.out.println("Test Example 2");
    }

    @BeforeTest
    public void beforeTestExample(){
        System.out.println("Before Test Example");
    }

    @AfterTest
    public void afterTestExample(){
        System.out.println("After Test Example");
    }

    @BeforeSuite
    public void beforeSuiteExample(){
        System.out.println("Before Suite Example");
    }

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class Example");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class Example");
    }

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("Before Method Example");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method Example");
    }
}