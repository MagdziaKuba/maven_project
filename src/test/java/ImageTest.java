import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTest {
    @Test
    public void imageExistTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/image.html");
        //driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement image=driver.findElement(By.tagName("img"));
        //wysokość obrazka
        //jak 0 to nie wyświetlił się poprawnie
        System.out.println(image.getAttribute("naturalHeight"));
        //https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/naturalHeight

        /*String height=image.getAttribute("naturalHeight");
        Assert.assertEquals(height,"0");*/

    }
}
