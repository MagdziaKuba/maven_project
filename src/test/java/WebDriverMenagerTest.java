import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class WebDriverMenagerTest {
    @Test
    public void openBrowser(){


        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        //niewidoczny interface użytkownika
        //options.setHeadless(true);
        options.setHeadless(false);
        //obsługiwanie alertów
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
        WebDriver driver= new ChromeDriver(options);
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("alert('hello')");
        driver.get("https://www.google.com/");


        /*WebDriverManager.iedriver().setup();
        InternetExplorerOptions options=new InternetExplorerOptions();
        options.withInitialBrowserUrl("https://www.google.com/");
        WebDriver driver= new InternetExplorerDriver(options);*/

    }
}
