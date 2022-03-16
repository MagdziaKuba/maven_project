package testNG;

import org.testng.annotations.DataProvider;
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


    //metoda testowa korzystajaca z dataProvidera
    @Test(dataProvider = "data")
    public void dpTest(String val){
        System.out.println(val);
    }
    //DataProvider
    @DataProvider(name="data")
    public Object[][] dataProvider(){

        return new Object[][]{{"I am first test"},{"I am second test."}};
    }
}
