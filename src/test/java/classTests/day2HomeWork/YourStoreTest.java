package classTests.day2HomeWork;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2HomeWork.*;

import java.awt.*;

public class YourStoreTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(YourStoreTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void ysTest() throws AWTException, InterruptedException {
        LOGGER.info("Initializing YourStore Home Page");
        YSHomePage ysHomePage = new YSHomePage(driver);

        Assertions.assertTrue(ysHomePage.componentsMenu.isDisplayed(), "Components button is not displayed");
        ysHomePage.clickComponentsMenu();

        Assertions.assertTrue(ysHomePage.monitorsButton.isDisplayed(), "Monitors button is not displayed");
        ysHomePage.clickMonitorsButton();

        LOGGER.info("Initializing YourStore Monitors Page");
        YSMonitorsPage ysMonitorsPage = new YSMonitorsPage(driver);

        Assertions.assertTrue(ysMonitorsPage.addToCartButton.isDisplayed());
        ysMonitorsPage.clickAddToCartButton();

        LOGGER.info("Initializing YourStore Apple monitor Page");
        YSAppleMonitorPage ysAppleMonitorPage = new YSAppleMonitorPage(driver);

        LOGGER.info("Populating options on Apple monitor Page");
        ysAppleMonitorPage.clickRadioOption(1);
        ysAppleMonitorPage.clickCheckBoxOption(2);
        ysAppleMonitorPage.fillTextOption("Good Job!");
        ysAppleMonitorPage.clickSelectOption(1);
        ysAppleMonitorPage.fillTextAreaOption("Let's continue");
        ysAppleMonitorPage.uploadFile();
        ysAppleMonitorPage.setDateOption();
        ysAppleMonitorPage.setTimeOption();
        ysAppleMonitorPage.setDateAndTimeOption();
        ysAppleMonitorPage.clickAddToCartButton();
        ysAppleMonitorPage.clickCartButton();
        ysAppleMonitorPage.clickCheckOutButton();

        LOGGER.info("Initializing YourStore Checkout Page");
        YSCheckoutPage ysCheckoutPage = new YSCheckoutPage(driver);

        ysCheckoutPage.clickGuestRadioButton();
        ysCheckoutPage.clickContinueButton();
        LOGGER.info("Populating Billing Details");
        ysCheckoutPage.populateAccountFields("Darja", "Semenkova", "abc@gmail.com", "12345678");
        ysCheckoutPage.populateAddressFields("Main Str.1", "Riga", "LV-0000", 6, 3);
        ysCheckoutPage.passDeliveryMethod();

        ysCheckoutPage.passPaymentMethod();

        LOGGER.info("Initializing YourStore Success Page");
        YSSuccessPage ysSuccessPage = new YSSuccessPage(driver);

        ysSuccessPage.orderPlacedConfirmation();
        ysSuccessPage.clickCartButton();

        LOGGER.info("Checking the assertions");
        Assertions.assertEquals("Your shopping cart is empty!", ysSuccessPage.cartStatus, "Cart is not empty");
        Assertions.assertEquals("Your order has been placed!", ysSuccessPage.confirmation, "Order has not be placed");
    }

}

