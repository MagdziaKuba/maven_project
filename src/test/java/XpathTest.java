import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {
    @Test
    public void findElement() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        /*WebElement buttonId=driver.findElement(By.xpath("/html/body/button[@id='clickOnMe']"));
        buttonId.click();*/
        ////*[@id="clickOnMe"]
        //driver.findElement(By.id("clickOnMe")).click();

        WebElement nameFile=driver.findElement(By.xpath("//input[@name='fname']"));
        nameFile.sendKeys("coś");

        WebElement hiddenElement=driver.findElement(By.xpath("//p[@class='topSecret']"));
        //znalezienie inputów na stronie
        WebElement inputLocator=driver.findElement(By.xpath("//input"));
        List<WebElement> inputs=driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());

        WebElement linkText=driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        //linkText.click();
        //
        WebElement partialLink=driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));

        By fullPath= By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPth=By.xpath("//ul");
        driver.findElement(shortPth);

        By allXpath=By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement= By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement=By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAtribut=By.xpath("//*[@name]");
        driver.findElement(elementWithAtribut);


        By atrEq=By.xpath("//button[@id='clickOnMe']");
        By atrNotEq= By.xpath("//*[@id!='clickOnMe']");
        By atrCont=By.xpath("//*[contains(@name,'ame')]");
        By startsWith=By.xpath("//*[starts-with(@name,'user')]");
        //By endsWith=By.xpath("//*[substring(@name,string-length(@name)-string-length('name')+1)='name']");

        By child=By.xpath("//div/child::ul");
        //w dół, dzieci, wnuki
        By desc=By.xpath("//div/descendant::ul");
        //rodzice, pradziadkowe, do góry
        By asc=By.xpath("//div/ancestor::*");
        By parent=By.xpath("//div/../..");
        //wystepujace po
        By foll=By.xpath("//img/following::*");
        //sibling-na tym samym poziomie
        By follSib=By.xpath("//img/following-sibling::*");
        By prec=By.xpath("//img/preceding::*");
        By precSib=By.xpath("//img/preceding-sibling::*");

        driver.findElement(child);
        //dok


        By divSumLink=By.xpath("//a | //div");
        By andOperator=By.xpath("//input[@name='fname' and @id='fname']");
        By orOperator=By.xpath("//input[@name='fname' or @id='fname']");





    }
}
