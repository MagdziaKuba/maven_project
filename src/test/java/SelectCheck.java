import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectCheck {
    //metoda przyjmuje String jako parametr i zwraca boolean
    //sprawdzi czy parametr String jest jedną z opcji w Select

    public  static boolean isOptions(String opcja, WebElement element ){
        Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        for(WebElement option: options) {

            if (option.getText().equals(opcja)) {

                return true;
            }
        }
        return false;



    }
}
