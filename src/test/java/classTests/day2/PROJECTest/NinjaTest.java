package classTests.day2.PROJECTest;

import baseWebTest.BaseWebTest;
import classTests.day3.StoreTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.PROJECT.*;

public class NinjaTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(StoreTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void ninjaTesting() {
        NinjaHomePage homePage = new NinjaHomePage(driver);
        LOGGER.info("Clicking on Components section");
        homePage.clickOnSectionComponents();
        LOGGER.info("Clicking on Monitors");
        homePage.clickOnSectionMonitors();

        NinjaMonitorsPage monitorsPage = new NinjaMonitorsPage(driver);
        LOGGER.info("Adding to cart");
        monitorsPage.clickOnAddToCart();

        NinjaApplePage applePage = new NinjaApplePage(driver);
//        LOGGER.info("Clicking radio button");
//        applePage.clickMediumRadioButton();
//        LOGGER.info("Clicking checkbox");
//        applePage.clickOnCheckBox3();
//        LOGGER.info("Clearing text box");
//        applePage.clearTextBox();
//        LOGGER.info("Writing text box");
//        applePage.writeText();
//        LOGGER.info("Selecting option");
//        applePage.selectOption();
//        LOGGER.info("Writing textarea");
//        applePage.writeTextarea();
//        LOGGER.info("Uploading file");
        //applePage.clickFileUpload();
//        applePage.setFile();
//        LOGGER.info("Selecting date");
//        applePage.selectDate();
//        LOGGER.info("Selecting time");
//        applePage.selectTime();
//        LOGGER.info("Selecting datetime");
//        applePage.selectDateAndTime();
        LOGGER.info("Adding to cart");
        applePage.clickAddToCartButton();
        LOGGER.info("Clicking on cart button");
        applePage.clickCartButton();
        LOGGER.info("Clicking on checkout button");
        applePage.clickCheckoutButton();

        NinjaCheckoutPage checkoutPage = new NinjaCheckoutPage(driver);
        LOGGER.info("Clicking on Guest Checkout");
        checkoutPage.clickGuestCheckout();
        LOGGER.info("Clicking on Continue");
       checkoutPage.clickOnContinue();
        LOGGER.info("Writing Name");
       checkoutPage.writeName();
        LOGGER.info("Writing Last Name");
       checkoutPage.writeLastName();
        LOGGER.info("Writing E-Mail");
       checkoutPage.writeEmail();
        LOGGER.info("Writing Telephone");
       checkoutPage.writeTelephone();
        LOGGER.info("Writing Adress");
        checkoutPage.writeAddressOne();
        LOGGER.info("Writing City");
        checkoutPage.writeCity();
        LOGGER.info("Writing Postal Code");
        checkoutPage.writePostCode();
        LOGGER.info("Selecting Country");
       checkoutPage.selectCountry();
        LOGGER.info("Selecting Region");
        checkoutPage.selectRegion();
        LOGGER.info("Click on My address are the same box");
        checkoutPage.clickOnBillingCheckBox();
        LOGGER.info("Clicking on Continue");
        checkoutPage.clickContinue();

        LOGGER.info("Writing Name");
        checkoutPage.writeFirstName2();
        LOGGER.info("Writing Last Name");
        checkoutPage.writeLastName2();
        LOGGER.info("Writing Address");
        checkoutPage.writeAddress2();
        LOGGER.info("Writing City");
        checkoutPage.writeCity2();
        LOGGER.info("Selecting Country");
        checkoutPage.selectCountry2();
        LOGGER.info("Selecting Region");
        checkoutPage.selectRegion2();
        LOGGER.info("Clicking on Continue");
        checkoutPage.clickContinue2();
        LOGGER.info("Writing Comments");
        checkoutPage.writeComments();
        LOGGER.info("Clicking on Continue");
        checkoutPage.clickContinue3();
        LOGGER.info("Click terms checkbox");
        checkoutPage.clickOnTermsCheckBox();
        LOGGER.info("Clicking on Continue");
        checkoutPage.clickContinue4();
        LOGGER.info("Clicking on Confirm Order");
        checkoutPage.clickOnConfirmButton();

        NinjaSuccessPage successPage = new NinjaSuccessPage(driver);
        boolean isShown = successPage.isSuccessMessageShown();
        Assert.assertTrue(isShown,"Your order has not been placed!");

        successPage.clickCartButton();
        boolean isEmptyCartMessageShown = successPage.isEmptyCartMessageShown();
        Assert.assertTrue(isEmptyCartMessageShown,"Cart is not empty!");
    }

}
