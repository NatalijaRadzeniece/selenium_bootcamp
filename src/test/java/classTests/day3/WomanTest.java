package classTests.day3;

import baseWebTest.BaseWebTest;
import classTests.day2.AlertTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.HomePage;
import pageObject.day3.ItemCartPage;
import pageObject.day3.ItemPage;
import pageObject.day3.ItemSizePage;
import pageObject.day3.WomanPage;

public class WomanTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testWomenButtonClick() {

        LOGGER.info("initializing Woman page");
        WomanPage womanPage = new WomanPage(driver);
        LOGGER.info("clicking on Woman field");
        womanPage.clickWomenButton();

        LOGGER.info("initializing Item page");
        ItemPage itemPage = new ItemPage(driver);
        LOGGER.info("clicking on item blouse");
        itemPage.clickItemOne(1);

        LOGGER.info("initializing ItemSize page");
        ItemSizePage itemSizePage = new ItemSizePage(driver);
        LOGGER.info("clicking on size Selector");
        itemSizePage.clickSizeSelector();
        LOGGER.info("selecting size M");
        itemSizePage.clickSelectedSize();
        LOGGER.info("adding item to cart");
        itemSizePage.clickAddToCart();
        LOGGER.info("clicking continue shopping");
        itemSizePage.clickContinueShopping();

        LOGGER.info("navigating to woman page 2nd time");
        womanPage.clickWomenButton();

        LOGGER.info("clicking on item printed Chiffon dress");
        itemPage.clickItemOne(6);

        LOGGER.info("clicking on size selector");
        itemSizePage.clickSizeSelector();
        LOGGER.info("selecting size M");
        itemSizePage.clickSelectedSize();
        LOGGER.info("adding item to cart");
        itemSizePage.clickAddToCart();
        LOGGER.info("clicking continue shopping");
        itemSizePage.clickContinueShopping();

        LOGGER.info("clicking on shopping cart");
        womanPage.clickShoppingCart();

        LOGGER.info("initializing Item cart page");
        ItemCartPage itemCartPage = new ItemCartPage(driver);

        LOGGER.info("checking if name of each object matches");
        Assertions.assertEquals(itemCartPage.getProductOneName(1), "Printed Chiffon Dress");
        Assertions.assertEquals(itemCartPage.getProductTwoName(2), "Blouse");

        LOGGER.info("check item count in cart");
        Assertions.assertEquals(itemCartPage.getProductQuantity(), "2 Products");

        LOGGER.info("check price of each item");
        Assertions.assertEquals(itemCartPage.getProductOnePrice(), "$27.00");
        Assertions.assertEquals(itemCartPage.getProductTwoPrice(), "$16.40");

        LOGGER.info("check total price of cart");
        Assertions.assertEquals(itemCartPage.getTotalPrice(), "$45.40");
    }
}
