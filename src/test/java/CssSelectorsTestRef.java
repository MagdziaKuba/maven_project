import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CssSelectorsTestRef {
    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement cssId=driver.findElement(By.cssSelector("#clickOnMe"));

        WebElement cssClass=driver.findElement(By.cssSelector(".topSecret"));

        WebElement cssTag=driver.findElement(By.cssSelector("input"));

        WebElement cssName=driver.findElement(By.cssSelector("[name='fname']"));

        WebElement cssClass2=driver.findElement(By.cssSelector("[class='topSecret']"));

        List<WebElement> allEle=driver.findElements(By.cssSelector("*"));

        WebElement ulInsideDiv=driver.findElement(By.cssSelector("div ul"));
        WebElement firstChildUlinDiv=driver.findElement(By.cssSelector("div > ul"));

        // > + ~
        WebElement firstFormAfterLabel=driver.findElement(By.cssSelector("label + form"));
        WebElement allFormAfterLabel=driver.findElement(By.cssSelector("label ~ form"));

        WebElement attrTag=driver.findElement(By.cssSelector("input[name='fname']"));
        //wyszukuje wszystkie o danej wartosci
        WebElement attrContains=driver.findElement(By.cssSelector("[name*='name']"));
        //wyszukuje o podanym poczatku
        WebElement attrStarts=driver.findElement(By.cssSelector("[name^='f']"));
        //wyszukuje kończące się na
        WebElement attrEnds=driver.findElement(By.cssSelector("[name$='name']"));


        WebElement firstChild=driver.findElement(By.cssSelector("li:first-child"));
        WebElement lastChild=driver.findElement(By.cssSelector("li:last-child"));
        //numerujemy dzieci od 1
        WebElement thirdChild=driver.findElement(By.cssSelector("li:nth-child(3)"));


    }
}
