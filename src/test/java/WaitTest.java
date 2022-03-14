import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitTest {
    @Test
    public void waittest() /*throws InterruptedException*/ {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        //przez 10 sekund zadaje pytanie, aż do pojawienia się
        //max 10 sek, min 0
        //wykład 203 przestarzałe, nie działą
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("clickOnMe")).click();
        //ostateczność
        //Thread.sleep(5000);

        /*WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));*/

        /*FluentWait<WebDriver> wait= new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        //odpytanie przez 10 sek
        wait.withTimeout(Duration.ofSeconds(10));
        //odpytanie po 1 sek
        wait.pollingEvery(Duration.ofSeconds(1));
        //visibility sprawdza widoczność
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));*/
        /*WebElement para=driver.findElement(By.cssSelector("p");
        wait.until(ExpectedConditions.visibilityOf(para)));*/
        //czy istnieje w strukturze
        //wait.until(ExpectedConditions.presenceOfElementLocated());
        //alertIsPresent()
        //stan np. checkboxa
        //elementSelectionStateToBe()
        //elementToBeClickable()

        //driver.findElements(By.cssSelector("p"));

        waitForElementToExist(By.cssSelector("p"),driver);
    }

    public void waitForElementToExist(By locator, WebDriver driver){

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
        //Dodawanie włąsnego warunku za pomocą wyrażenia lambda
        //https://www.samouczekprogramisty.pl/wyrazenia-lambda-w-jezyku-java/
        /*wait.until((driver)->{

                List<WebElement> elements=driver.findElements(locator);
                if(elements.size()>0){
                    System.out.println("element jest na stronie");
                    return true;
                }else{
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }
        });*/
    }
}
