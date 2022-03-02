import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void openPage() throws InterruptedException {
        WebDriver driver=SeleniumTest.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement agreeButton=driver.findElement(By.xpath("//div[contains(text(),'Zgadzam')]"));
        ///html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/button[2]/div
        agreeButton.click();

        //powrót do pierwotnego okna
        driver.switchTo().defaultContent();
        WebElement serchField=driver.findElement(By.name("q"));
        serchField.sendKeys("Selenium");
        serchField.sendKeys(Keys.ENTER);
        WebElement result= driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//span"));
        Assert.assertTrue(result.isDisplayed());


    }



}
