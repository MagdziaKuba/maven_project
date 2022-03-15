package testNG;

import org.testng.annotations.Test;

public class FourTest {
    @Test(dependsOnMethods = {"thirdTest"})
    public void firstTest(){
        System.out.println("I am 1");
    }

    @Test(dependsOnMethods = {"firstTest"})
    public void secondTest(){
        System.out.println("I am 2");
    }

    @Test
    public void thirdTest(){
        System.out.println("I am 3");
    }
}
