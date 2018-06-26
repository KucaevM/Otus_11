package blazedemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;



public class TakeScreenShot {

    public static void takeScreenShot(WebDriver driver){

        File scrinFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = "./target/screenshots/" + scrinFile.getName();
        try {
            FileUtils.copyFile(scrinFile, new File (path));

        } catch (IOException e) {

        }
    }
}
