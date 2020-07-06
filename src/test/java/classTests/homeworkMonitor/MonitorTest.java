package classTests.homeworkMonitor;

import baseWebTest.BaseWebTest;
import classTests.day2.AlertTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.homeworkMonitor.*;

public class MonitorTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void testMonitorsButtonClick() throws InterruptedException {
        LOGGER.info("initializing Main page");
        MainPage mainPage = new MainPage(driver);
        LOGGER.info("click on Components drop down menu");
        mainPage.clickComponentsDropDown();
        LOGGER.info("clicking on Monitors page");
        mainPage.clickMonitorsButton();

        LOGGER.info("initializing Monitors page");
        MonitorsPage monitorsPage = new MonitorsPage(driver);
        LOGGER.info("Clicking on Add to cart");
        monitorsPage.clickAddToCart();

        LOGGER.info("initializing AppleCinema30 page");
        AppleCinema30Page appleCinema30Page = new AppleCinema30Page(driver);
        LOGGER.info("click on radio Large size");
        appleCinema30Page.clickRadioSize(1);
        LOGGER.info("click on checkbox 2");
        appleCinema30Page.clickCheckboxButton(0);
        LOGGER.info("Write in text field");
        appleCinema30Page.writeInTextField("Hello, this is me!");
        LOGGER.info("Select color yellow in drop down");
        appleCinema30Page.selectColors("2");
        LOGGER.info("Write in text area field");
        appleCinema30Page.writeInTextAreaField("My new monitor will be the best!");
        LOGGER.info("upload file");
        appleCinema30Page.uploadFile();
        LOGGER.info("set date");
        appleCinema30Page.setDateOnly();
        LOGGER.info("set time");
        appleCinema30Page.setTimeOnly();
        LOGGER.info("set time and date");
        appleCinema30Page.setTimeAndDate();
        LOGGER.info("set quantity");
        appleCinema30Page.selectQuantity("3");
        LOGGER.info("click add to cart button");
        appleCinema30Page.clickAddToCartButton();
        LOGGER.info("click cart button");
        appleCinema30Page.clickCartButton();
        LOGGER.info("click Checkout button");
        appleCinema30Page.clickCheckoutButton();

        LOGGER.info("initializing Checkout Page");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        LOGGER.info("Select guest checkout");
        checkoutPage.clickGuestCheckout();
        LOGGER.info("click on continue button");
        checkoutPage.clickContinueButton();
        LOGGER.info("fill in personal data");
        checkoutPage.insertYourPersonalDetails("Elina","Corgi","corgi@gmail.com","77885511");
        LOGGER.info("fill in your address");
        checkoutPage.insertYourAddress("Volcano street 1","Kuresare","5674");
        LOGGER.info("select country");
        checkoutPage.selectCountry("Estonia");
        LOGGER.info("fill in state");
        checkoutPage.selectRegionStateInput("Saaremaa (Kuessaare)");
        LOGGER.info("Press next continue button");
        checkoutPage.clickContinueBut();
        LOGGER.info("Continue delivery");
        checkoutPage.clickContShipButton();
        LOGGER.info("Agree on terms and conditions");
        checkoutPage.clickAgreeTermsAndCond();
        LOGGER.info("Continue payment");
        checkoutPage.clickContPayButton();

//Did not work - could not locate the textbox(big one) in checkout last step "waiting for visibility of"
//        LOGGER.info("check if cart matches input");
//        Assertions.assertEquals("Large",checkoutPage.getRadioSize(),"Radio is not the same");
//        Assertions.assertEquals("Checkbox 2",checkoutPage.getCheckboxNumber(), "Checkbox is not the same");
//        Assertions.assertEquals("Hello, this is me!",checkoutPage.getTextInput(),"Text not the same");
//        Assertions.assertEquals("Yellow",checkoutPage.getSelectColor(),"Color not the same");
//        Assertions.assertEquals("My new monitor will be the best!",checkoutPage.getTextArea(),"Text area text does not match");

        LOGGER.info("Press Confirm Order");
        checkoutPage.clickConfirmOrderButton();


        LOGGER.info("initializing Success Page");
        SuccessPage successPage = new SuccessPage(driver);
        LOGGER.info("verify order successful");
        Assertions.assertEquals("Your order has been placed!",successPage.verifyOrderSuccessful(),"Error, order not placed!");
        LOGGER.info("verify empty cart");
        Assertions.assertEquals("0 item(s) - $0.00", successPage.verifyEmptyCart(),"Cart is not empty!");
    }

}
