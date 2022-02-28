import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverMenagerTest {
    @Test
    public void openBrowser(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();

    }
}
