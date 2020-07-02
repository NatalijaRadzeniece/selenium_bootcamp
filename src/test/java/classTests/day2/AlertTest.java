package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.AlertPage;

public class AlertTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void  navigateTo(){
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting(){

        LOGGER.info("initializing Alert page");
        AlertPage alertPage = new AlertPage(driver);

        LOGGER.info("Clicking on simple Alert");

        alertPage.clickSimpleAlert();
        LOGGER.info("Acceptiong simple Alert");
        alertPage.acceptAlert();

        alertPage.clickConfirmAlert();
        alertPage.dismissAlert();

        alertPage.clickPromptAlert();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }
}
