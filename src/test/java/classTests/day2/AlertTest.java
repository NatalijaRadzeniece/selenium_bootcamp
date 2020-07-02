package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.AlertPage;

public class AlertTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting() {

        LOGGER.info("Initializing Alert page");

        AlertPage alertPage = new AlertPage(driver);//connecting page to
        LOGGER.info("Clicking on Alert page");
        alertPage.clickOnSimpleAlertButton();
        LOGGER.info("Accepting Alert page");
        alertPage.acceptAlert();

        alertPage.clickOnConfirmationAlertButton();
        alertPage.dismissAlert();

        //alertPage.clickOnPromptAlertButton();
        //alertPage.setTextAlert();
        //alertPage.acceptAlert();


    }
}
