import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicActionsTest {
    @Test
    public void performAction(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium");

        WebElement basicLink=driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicLink.click();
        driver.findElement(By.id("clickOnMe")).click();
        //https://www.selenium.dev/documentation/webdriver/waits/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        Alerty.alertyAccept(driver);
        /*Alert alert=driver.switchTo().alert();
        alert.accept();*/
        driver.findElement(By.id("fname")).sendKeys("Magda");

        WebElement usernameInput=driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("admin");
        //usernameInput.sendKeys(Keys.TAB);

        usernameInput.sendKeys(Keys.ENTER);

        Alerty.alertyAccept(driver);
        Alerty.alertyAccept(driver);

        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='female']")).click();

        WebElement selectCar=driver.findElement(By.cssSelector("select"));
        Select cars=new Select(selectCar);
        //po indeksie numeracja od 0
        //cars.selectByIndex(2);
        //cars.selectByVisibleText("Saab");
        cars.selectByValue("volvo");
        












    }
}
