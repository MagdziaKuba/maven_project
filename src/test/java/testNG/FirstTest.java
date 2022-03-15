package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class FirstTest extends BaseTest{
    WebDriver driver;
    @Test
    public void firstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(5000);
        String paraText=driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText,"Dopiero się pojawiłem!");
    }

    @Test
    public void secondTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(5000);
        String paraText=driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText,"Dopiero się pojawiłem!");
        //aktualny, oczekiwany, info która pojawi się, gdy asercja zakończy się niepowodzeniem
        //Assert.assertEquals(paraText,"Dopiero","Teksty są różne");
        /*
        * //Sprawdzenie czy nasza aplikacja działą poprawnie. Czy aktualny rezultat jest zgodny z oczekiwanym.
        Assert.assertEquals()
        Assert.assertEquals(zmienna.isDisplayed(), true);
        Assert.assertTrue(zmienna.isDisplayed());
        Assert.assertTrue(zmienna.getText().startsWith("Dopiero");
        Assert.assertFalse();

* */
        driver.quit();
    }



    public void waitForElementToExist(By locator){

        FluentWait<WebDriver> wait= new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

        //dostarczanie włąsnego warunku
       wait.until(new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                List<WebElement> elements=driver.findElements(locator);
                if(elements.size()>0){
                    System.out.println("element jest na stronie");
                    return true;
                }else{
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }

            }
        });
    }
}
