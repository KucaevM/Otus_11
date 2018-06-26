package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    //WebDriver driver;

   // public SelectClass (){this.driver = driver;}

    public static void SelectMetod (WebElement element, String text) {

        Select selectObject = new Select(element);
        selectObject.selectByValue(text);
    }


}
