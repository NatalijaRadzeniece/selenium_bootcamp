package classTests.day3;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.ClothesPage;

public class ClothesTest extends BaseWebTest {
    final Logger logger = LogManager.getLogger(ClothesTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void clickWomen() throws InterruptedException {
        logger.info("Initializing Home page");
        ClothesPage clothesPage = new ClothesPage(driver);

        logger.info("Clicking Women tab");
        clothesPage.clickOnWomen();

        clothesPage.waitUntilProductPageLoaded();
        clothesPage.addToCart(4);

        // Thread.sleep(3000);
    }
}
