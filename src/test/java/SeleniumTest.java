import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

        @Test
        public void openGooglePage(){
            /*String url="C:\\Users\\mkuba\\Downloads\\chromedriver_win32\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",url);
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");*/

            /*String url="C:\\Users\\mkuba\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver",url);
            WebDriver driver=new FirefoxDriver();
            driver.get("https://www.google.com/");*/

            /*String url="C:\\Users\\mkuba\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe";
            System.setProperty("webdriver.ie.driver",url);
            WebDriver driver=new InternetExplorerDriver();
            driver.get("https://www.google.com/");*/

            WebDriver driver=getDriver("chrome");
            //zmiana wielkości okna przeglądarki
            driver.manage().window().maximize();

            /*Dimension windowSize=new Dimension(200,200);
            driver.manage().window().setSize(windowSize);*/

        }
        public WebDriver getDriver(String browser){
            //illegal argument exception
            switch(browser){
                case "ie":
                    System.setProperty("webdriver.ie.driver","C:\\Users\\mkuba\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
                    return new InternetExplorerDriver();
                case "chrome":
                    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mkuba\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
                    return new ChromeDriver();
                case "firefox":
                    System.setProperty("webdriver.gecko.driver","C:\\Users\\mkuba\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
                    return new FirefoxDriver();
                default:
                    throw new InvalidArgumentException("Invalid browser name");

            }


        }

}
