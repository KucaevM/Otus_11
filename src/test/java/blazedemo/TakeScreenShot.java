package blazedemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.Variables;

import java.io.File;
import java.io.IOException;



public class TakeScreenShot {

    public static void takeScreenShot(WebDriver driver,String TestName){

        File scrinFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String pathFile = Variables.CatalogForScreenshots + TestName + "_" + scrinFile.getName();
        try {
            FileUtils.copyFile(scrinFile, new File (pathFile));

        } catch (IOException e) {

        }
    }
}
