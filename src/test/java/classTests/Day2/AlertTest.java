package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.AlertPage;
import pageObject.day1.HomePage;

public class AlertTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting() {
        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickSimpleAlert();
        alertPage.acceptAlert();

        alertPage.clickConfirmAlert();
        alertPage.dismissAlert();

        alertPage.clickPromtAlert();
        alertPage.setTextAlert();
        alertPage.acceptAlert();


    }

}