package classTests.day2;

import baseWebTest.BaseWebTest;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.AlertPage;

public class AlertTest extends BaseWebTest {

    @BeforeClass
    public void  navigateTo(){
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting(){
        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickSimpleAlert();
        alertPage.acceptAlert();

        alertPage.clickConfirmAlert();
        alertPage.dismissAlert();

        alertPage.clickPromptAlert();
        alertPage.setTextAlert();
        alertPage.acceptAlert();

    }
}
