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

public class UploadTest {
    @Test
    public void uploadFile() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        int randomNumber=(int) (Math.random()*1000);

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\mkuba\\Documents\\naukaMoja\\selenium\\simple.txt");

        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File src=screenshot.getScreenshotAs(OutputType.FILE);
        String nameFile="screenshot"+randomNumber+".png";
        FileUtils.copyFile(src, new File("src/test/resources/"+nameFile));

        //klikanie prawym przyciskiem myszy
        Actions actions=new Actions(driver);
        actions.contextClick().perform();

        //podwójne kliknięcie
        //actions.contextClick(driver.findElement(By.id("myFile"))).perform();
        //perform()-wykonanie sie



    }
}
