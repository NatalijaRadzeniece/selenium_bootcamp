package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.AlertPage;

public class AlertTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting(){

        LOGGER.info("Initializing Alert page");
        AlertPage alertPage = new AlertPage(driver);

        LOGGER.info("Clicking on simple Alert");
        alertPage.clickOnSimpleAlertButton();

        LOGGER.info("Accepting simple Alert");
        alertPage.acceptAlert();

        alertPage.clickOnConformationAlertButton();
        alertPage.dismissAlert();


        alertPage.clickOnPromptAlertButton();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }



}
