package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.AlertPage;

public class AlertTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");

    }

    @Test
    public void alertTesting(){
        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickSimpleAlert();
        alertPage.acceptAlert();

        alertPage.confirmConfirmAlert();
        alertPage.dismissAlert();

        alertPage.clickOnPromptAlert();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }


}
