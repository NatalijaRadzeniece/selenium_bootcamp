package classTests.day3;

import baseWebTest.BaseWebTest;
import classTests.day2.AlertTest;
import com.sun.media.jfxmedia.logging.Logger;
import model.Article;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.StorePageOne;
import pageObject.day3.StorePageThree;
import pageObject.day3.StorePageTwo;


public class StoreTest extends BaseWebTest {

    final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(StoreTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");

    }
    @Test
    public void storeTesting(){
        StorePageOne homePage = new StorePageOne(driver);
        LOGGER.info("Clicking on Women selection");
        homePage.clickOnsectionWomen();

        StorePageTwo productPage = new StorePageTwo(driver);

        LOGGER.info("Clicking on add to cart for first product");
        productPage.addProductToCart(0);
        Product productsPageProduct1 = productPage.getProduct(0);

        LOGGER.info("CLose pop-up window");
        productPage.closePopup();

        LOGGER.info("Clicking on add to cart for second product");
        productPage.addProductToCart(1);
        Product productsPageProduct2 = productPage.getProduct(1);

        LOGGER.info("CLose pop-up window");
        productPage.closePopup();

        LOGGER.info("Clicking on Shopping Cart button");
        productPage.goToShoppingCart();

        StorePageThree cartPage = new StorePageThree(driver);
        Product cartPageProduct1 = cartPage.getProduct(0);
        Product cartPageProduct2 = cartPage.getProduct(1);

        Assertions.assertEquals(cartPageProduct1.getTitle(), productsPageProduct1.getTitle(), "Product titles are not the same");
        Assertions.assertEquals(cartPageProduct1.getPrice(), productsPageProduct1.getPrice(), "Product prices are not the same");

        Assertions.assertEquals(cartPageProduct2.getTitle(), productsPageProduct2.getTitle(), "Product titles are not the same");
        Assertions.assertEquals(cartPageProduct2.getPrice(), productsPageProduct2.getPrice(), "Product prices are not the same");

        double totalPriceCartPage = cartPage.getTotalPrice();
        double totalPriceProductsPage = productsPageProduct1.getPrice() + productsPageProduct2.getPrice();
        Assertions.assertEquals(totalPriceCartPage, totalPriceProductsPage, "Product prices are not the same");

    }
}
