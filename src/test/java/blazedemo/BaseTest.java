package blazedemo;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.*;
import org.testng.annotations.*;
import utils.Variables;
import utils.WebDriverManager;

import java.io.FileWriter;
import java.io.IOException;

@Listeners (TestListener.class)
public  class BaseTest {

    protected WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void BeforeClass() {

        driver = WebDriverManager.getInstance();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void AfterClass() {


        LogEntries logEntries = driver.manage().logs().get(LogType.PERFORMANCE);

       try(FileWriter writer = new FileWriter(Variables.CatalogForScreenshots + "traffic.txt", false))
        {
            for (LogEntry entry : logEntries)
            {
                writer.write(String.format("%s:%s-%s\n",entry.getLevel(),entry.getTimestamp(), entry.getMessage()));

            }

            writer.flush();

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        driver.quit();
    }
}