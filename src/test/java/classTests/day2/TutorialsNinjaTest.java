package classTests.day2;

import baseWebTest.BaseWebTest;
import model.OrderInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.*;

public class TutorialsNinjaTest extends BaseWebTest {
    final Logger logger = LogManager.getLogger(TutorialsNinjaTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    final String PRODUCT_NAME = "Apple Cinema 30\"";

    @Test
    public void checkingTutorialsNinja() {
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
        atvPage.proceedingToCheckout();

        logger.info("Completing checkout");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.settingCheckoutOptions();
        checkoutPage.populatingBillingDetails();
        checkoutPage.deliveryMethod();
        checkoutPage.paymentMethod();
        OrderInfo orderInfo = checkoutPage.verifyOrder();
        Assertions.assertEquals(orderInfo.productName1,
                "Apple Cinema 30\"\n" +
                        "  - Radio: Large\n" +
                        "  - Checkbox: Checkbox 4\n" +
                        "  - Text: The big brown fox ju..\n" +
                        "  - Select: Yellow\n" +
                        "  - Textarea: Lorem ipsum dolor si..\n" +
                        "  - File: cartoon-unicorn-png-..\n" +
                        "  - Date: 2020-07-05\n" +
                        "  - Time: 17:31\n" +
                        "  - Date & Time: 2020-07-05 17:31",
                "Invalid product name");
        Assertions.assertEquals(orderInfo.quantity1, 2, "Invalid product quantity");
        Assertions.assertEquals(orderInfo.totalPrice, 329, "Invalid product total price");
        checkoutPage.confirmOrder();

        OrderPlacedPage orderPlacedPage = new OrderPlacedPage(driver);
        Assertions.assertEquals(orderPlacedPage.orderPlacingResult(), "Your order has been placed!", "Invalid message!");
        Assertions.assertEquals(orderPlacedPage.cartButtonText(), "0 item(s) - $0.00", "Cart is not empty");
    }
}
