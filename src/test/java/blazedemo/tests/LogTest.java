package blazedemo.tests;

import Elements.SelectClass;
import blazedemo.BaseTest;
import org.testng.annotations.Test;


public class LogTest  extends BaseTest {
    @Test
    public void test()  {

        driver.get("http://blazedemo.com/index.php");

        SelectClass.SelectMetod(homePage.elementfromPort(),"Boston");
        SelectClass.SelectMetod(homePage.elementtoPort(),"Rome");
        homePage.enterToFind().click();

    }
    @Test
    public void testError()  {

        driver.get("http://blazedemo.com/index.php");

        SelectClass.SelectMetod(homePage.elementfromPortError(),"Boston");
        SelectClass.SelectMetod(homePage.elementtoPort(),"Rome");
        homePage.enterToFind().click();

    }
}

