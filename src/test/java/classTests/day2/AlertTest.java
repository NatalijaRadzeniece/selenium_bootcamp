package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.AlertPage;

public class AlertTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting() {
        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickJsAlertButton();
        alertPage.acceptAlert();

        alertPage.clickJsConfirmButton();
        alertPage.acceptAlert();

        alertPage.clickJsPromptButton();
        alertPage.acceptAlert();
    }
}
