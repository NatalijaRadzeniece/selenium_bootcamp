package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.OneATVPage;
import pageObject.day2.TutorialsNinjaHomePage;
import pageObject.day2.TutorialsNinjaMonitorsPage;

public class TutorialsNinjaTest extends BaseWebTest {
    final Logger logger = LogManager.getLogger(TutorialsNinjaTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    final String PRODUCT_NAME = "Apple Cinema 30\"";

    @Test
    public void checkingTutorialsNinja() throws InterruptedException {
        logger.info("Clicking on Components / Monitors");
        TutorialsNinjaHomePage homePage = new TutorialsNinjaHomePage(driver);
        homePage.clickComponents();
        homePage.clickMonitors();

        logger.info("Selecting ATV");
        TutorialsNinjaMonitorsPage monitorsPage = new TutorialsNinjaMonitorsPage(driver);
        monitorsPage.selectProductByName(PRODUCT_NAME);

        logger.info("Adding ATV to Cart");
        OneATVPage atvPage = new OneATVPage(driver);
        atvPage.selectOptionsAndAddToCart();

        Thread.sleep(7000);
    }
}
