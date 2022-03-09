import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionsTest {
    @Test
    public void uploadFile() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");

        //klikanie prawym przyciskiem myszy
        Actions actions=new Actions(driver);
        //actions.contextClick().perform();


        //actions.contextClick(driver.findElement(By.id("myFile"))).perform();
        //perform()-wykonanie sie
        //podwójne klikniecie
        actions.doubleClick(driver.findElement(By.id("bottom"))).perform();


    }
}
