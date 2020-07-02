package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObject.Day2.AlertPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertTest extends BaseWebTest{
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting(){

        LOGGER.info("Initializing Alert page");
        AlertPage alertPage = new AlertPage(driver);

        LOGGER.info("clickOnSimpleAlert");
        alertPage.clickOnSimpleAlert();

        LOGGER.info("acceptAlert");
        alertPage.acceptAlert();

        alertPage.clickOnSimpleConfirm();
        alertPage.dismissAlert();

        alertPage.clickOnSimplePrompt();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }
}
