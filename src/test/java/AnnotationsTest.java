import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AnnotationsTest {
    //kolejność ma znaczenie!!
    @FindBys({
            @FindBy(tagName="table"),
            @FindBy(tagName = "th")
    }) List<WebElement> elements;

    @FindAll({
            @FindBy(tagName="table"),
            @FindBy(tagName = "th"),
            @FindBy(tagName = "a")
    }) List<WebElement> elements2;

    @Test
    public void performAction(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        System.out.println(elements.size());
        System.out.println(elements2.size());

    }
}
