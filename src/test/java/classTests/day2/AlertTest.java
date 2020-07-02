package classTests.day2;

import baseWebTest.BaseWebTest;
import pageObjects.day2.AlertPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//day3:
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class AlertTest extends BaseWebTest {
    //day3:
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting() {
        //day3 logger added:
        LOGGER.info("Initializing Alert Page");
        AlertPage alertPage = new AlertPage(driver);

        LOGGER.info("Clicking simple Alert");
        alertPage.clickSimpleAlert();
        alertPage.acceptAlert();

        LOGGER.info("Confirm simple Alert");
        alertPage.confirmConfirmAlert();
        alertPage.dismissAlert();

        LOGGER.info("Confirm propmpt Alert");
        alertPage.clickOnPromptAlert();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }


}
