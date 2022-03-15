package testNG;

import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{
    //domyślna wartość 0
    @Test(priority = 2)
    public void firstTest(){
        System.out.println("I am 1");
    }

    @Test(priority = 0)
    public void secondTest(){
        System.out.println("I am 2");
    }

    @Test(priority = 1)
    public void thirdTest(){
        System.out.println("I am 3");
    }
}
