package classTests.day3;

import baseWebTest.BaseWebTest;
import model.ProductInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.ClothesCartPage;
import pageObject.day3.ClothesMainPage;
import pageObject.day3.ClothesWomenPage;

public class ClothesTest extends BaseWebTest {
    final Logger logger = LogManager.getLogger(ClothesTest.class);
    final int[] productIndex = new int[]{4, 5};

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void doAllTheJob() {
        logger.info("Initializing Home page");
        ClothesMainPage clothesMainPage = new ClothesMainPage(driver);

        logger.info("Clicking Women tab");
        clothesMainPage.clickOnWomen();

        logger.info("Initializing Women page, waiting until page loads and initializing variables");
        ClothesWomenPage clothesWomenPage = new ClothesWomenPage(driver);
        clothesWomenPage.waitUntilLoaded();

        logger.info("Adding products to cart");
        ProductInfo[] piWomen = new ProductInfo[productIndex.length];

        for (int i = 0; i < productIndex.length; i++) {
            piWomen[i] = clothesWomenPage.addToCart(productIndex[i]);
        }

        clothesWomenPage.goToCart();

        logger.info("Counting products in cart");
        ClothesCartPage clothesCartPage = new ClothesCartPage(driver);

        for (int i = 0; i < productIndex.length; i++) {
            ProductInfo piCart = clothesCartPage.getProductInfo(i);
            Assertions.assertEquals(piWomen[i].title, piCart.title, "Titles are not the same in product " + (i + 1));
            Assertions.assertEquals(piWomen[i].price, piCart.price, "Prices are not the same in product " + (i + 1));
        }
    }
}
