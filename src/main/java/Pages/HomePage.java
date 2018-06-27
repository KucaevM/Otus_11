package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {this.driver = driver;}

    public WebElement elementfromPort() {return driver.findElement(By.name("fromPort"));}

    public WebElement elementfromPortError() {return driver.findElement(By.name("froPort"));}

    public WebElement elementtoPort() {return driver.findElement(By.name("toPort"));}

    public WebElement enterToFind() {return driver.findElement(By.cssSelector("body div > input"));}
}
