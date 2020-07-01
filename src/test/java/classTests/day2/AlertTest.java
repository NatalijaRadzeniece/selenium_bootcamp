package classTests.day2;

import baseWebTest.BaseWebTest;
import pageObject.Day2.AlertPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertTest extends BaseWebTest{
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting(){
        AlertPage alertPage = new AlertPage(driver);
        alertPage.clickOnSimpleAlert();
        alertPage.acceptAlert();

        alertPage.clickOnSimpleConfirm();
        alertPage.dismissAlert();

        alertPage.clickOnSimplePrompt();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }
}
