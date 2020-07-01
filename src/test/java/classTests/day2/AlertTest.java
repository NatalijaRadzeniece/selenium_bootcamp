package classTests.day2;

import PageObject.Day_2.AlertPage;
import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AlertTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {

        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");

    }

    @Test
    public void alertTesting() {
        AlertPage alertPage = new AlertPage(driver);
        alertPage.clickOnSimpleAlertButton();
        alertPage.acceptAlert();

        alertPage.clickOnAlertButton1();
        alertPage.acceptAlert();

        alertPage.clickOnAlertButton2();
        alertPage.acceptAlert();
    }
}
