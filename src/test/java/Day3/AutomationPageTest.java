package Day3;

import baseWebTest.BaseWebTest;
import classTests.Day2.AlertTest;
import model.AutomationPageM;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day3.SecondAutomationPage;
import pageObject.Day3.ThirdAutomationPage;
import pageObject.Day3.AutomationPage;

public class AutomationPageTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void AutomationPageTest() {
        AutomationPage webstore = new AutomationPage(driver);
        webstore.clickOnButtonWomen();

        SecondAutomationPage productSecondPage = new SecondAutomationPage(driver);
        AutomationPageM product = productSecondPage.getProductTitleAndPrice(1);

//        SecondAutomationPage secondPage = new SecondAutomationPage(driver);
//        secondPage.clickOnShirt();
//
//        LOGGER.info("clicking on Add to cart allert");
//        ThirdAutomationPage thirdPage = new ThirdAutomationPage(driver);
//        thirdPage.clickOnShirtAddToCartAllert();
//
////        LOGGER.info("Accepting alert");
////        thirdPage.clickOnShirtContinue();

    }
}