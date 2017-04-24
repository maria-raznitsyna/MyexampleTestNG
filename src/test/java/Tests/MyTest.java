package Tests;

import Pages.LoginPage;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by DELL on 3/26/2017.
 */
public class MyTest extends BaseTest {
    Logger logger = Logger.getLogger("MYTest");
    LoginPage loginPage;
    @BeforeClass
    public void beforeClassMyTest() throws Exception {
        loginPage= new LoginPage(driver);

    }

    @Test(description = "Login Test")
    public void testTest() throws Exception {


      String actual = loginPage.login("mytest_test","337774a").getMailUser();
      logger.info("actual - " + actual);

       Assert.assertEquals(actual,"mytest_test@mail.ru","Error ");

    }


}
