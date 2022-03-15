package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsercjeTest {
    @Test
    public void assertTesty() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(5000);
        WebElement para=driver.findElement(By.cssSelector("p"));
        //twarda asercja Assert. zamiast softAssert
        //soft asercja
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(para.isDisplayed(),true);
        softAssert.assertTrue(para.isDisplayed(),"Element is not displayed");
        softAssert.assertEquals(para.getText(),"Dopiero","Teksty są różne");
        softAssert.assertTrue(para.getText().startsWith("Dopiero"));
        softAssert.assertFalse(para.getText().startsWith("Pojawiłem"));
        softAssert.assertEquals(para.getText(),"Dopiero się!","Druga asercja");

        
        softAssert.assertAll();

    }
}
