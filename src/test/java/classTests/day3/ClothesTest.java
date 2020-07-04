package classTests.day3;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.ClothesCartPage;
import pageObject.day3.ClothesMainPage;
import pageObject.day3.ClothesWomenPage;
import pageObject.day3.ProductInfo;

public class ClothesTest extends BaseWebTest {
    final Logger logger = LogManager.getLogger(ClothesTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void clickWomen() throws InterruptedException {
        logger.info("Initializing Home page");
        ClothesMainPage clothesMainPage = new ClothesMainPage(driver);

        logger.info("Clicking Women tab");
        clothesMainPage.clickOnWomen();

        logger.info("Initializing Women page, waiting until page loads and initializing variables");
        ClothesWomenPage clothesWomenPage = new ClothesWomenPage(driver);
        clothesWomenPage.waitUntilLoaded();

        logger.info("Adding products to cart");
        ProductInfo pi1 = clothesWomenPage.addToCart(4);
        ProductInfo pi2 = clothesWomenPage.addToCart(5);

        clothesWomenPage.goToCart();

        logger.info("BlaBla");
        ClothesCartPage clothesCartPage = new ClothesCartPage(driver);

        clothesCartPage.getProductInfo(1);

        Thread.sleep(5000);


    }
 //   getProductInfo

}
