import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ExecutorTest {
    @Test
    public void executeJavaScript(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium");
        WebElement basicLink=driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", basicLink);

        WebElement firstName=driver.findElement(By.name("fname"));
        executor.executeScript("arguments[0].setAttribute('value','Magda');",firstName);

    }
}
