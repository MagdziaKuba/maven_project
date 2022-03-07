import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alerty {
    public static void alertyAccept(WebDriver driver){
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
