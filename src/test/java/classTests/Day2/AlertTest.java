package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.AlertPage;

public class AlertTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting() {
        LOGGER.info("Initializing Alert page");
        AlertPage alertPage = new AlertPage(driver);
        LOGGER.info("clicking simple  alert");
        alertPage.clickSimpleAlert();
        LOGGER.info("Accepting alert");
        alertPage.acceptAlert();

        alertPage.clickConfirmAlert();

        alertPage.dismissAlert();

        alertPage.clickPromtAlert();

        alertPage.setTextAlert();

        alertPage.acceptAlert();


    }

}
