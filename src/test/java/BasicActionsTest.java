import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BasicActionsTest {
    @Test
    public void performAction(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        //niewidoczny interface użytkownika
        options.setHeadless(true);
        WebDriver driver=new ChromeDriver(options);

        //WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium");

        WebElement basicLink=driver.findElement(By.linkText("Podstawowa strona testowa"));
        //System.out.println(basicLink.getText());
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

        //System.out.println(usernameInput.getText());- nie zadziała
        //Pobieranie wartości z pola tekstowego
        System.out.println(usernameInput.getAttribute("value"));

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
        //cars.selectByValue("volvo");

        //getOptions z klasy Select
        List<WebElement> optionsCar= cars.getOptions();
        for(WebElement element: optionsCar){
            System.out.println(element.getText());
        }

        SelectCheck checkSelect=new SelectCheck();
        System.out.println(checkSelect.isOptions("Audi",selectCar));
        System.out.println(checkSelect.isOptions("Saab",selectCar));
        System.out.println(checkSelect.isOptions("Cos",selectCar));

//pobieranie wartości z ukrytego elementu->getAttribute("textContent")
        WebElement paragraf= driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("getText "+paragraf.getText());
        System.out.println("getAttribute value "+paragraf.getAttribute("value"));
        System.out.println("getAttribute textContent "+paragraf.getAttribute("textContent"));


        //https://www.w3schools.com/js/js_popup.asp











    }
}
