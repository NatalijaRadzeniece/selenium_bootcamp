package classTests.HomeWorkTest;

import baseWebTest.BaseWebTest;
import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomeWork.LandingPage;

public class MonitorCheckoutTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {navigateTo("http://tutorialsninja.com/demo/"); }

    @Test
    public void testCheckout() {

        LandingPage landingPage = new LandingPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Components')]")));
        landingPage.clickOnBtnComponents();
        landingPage.clickOnBtnMonitors();

    }







}
