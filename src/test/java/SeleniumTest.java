import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

        @Test
        public void openGooglePage(){
            /*String url="C:\\Users\\mkuba\\Downloads\\chromedriver_win32\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",url);
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");*/

            String url="C:\\Users\\mkuba\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver",url);
            WebDriver driver=new FirefoxDriver();
            driver.get("https://www.google.com/");
        }

}
