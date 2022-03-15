package testNG;

import org.testng.annotations.*;

public class BaseTest {
    //jest rodzicem dla FirstTest i SecondTest

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am runing before suite.");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am runing before class.");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am runing after suite.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am runing after class.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am runing before test.");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am runing before method.");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am runing after test.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am runing after method.");
    }
}
