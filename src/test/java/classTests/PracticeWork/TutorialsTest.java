package classTests.PracticeWork;

import PageObject.PracticeWork.*;
import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TutorialsTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(TutorialsTest.class);

    @BeforeClass
    public void navigateTo() {


        navigateTo("http://tutorialsninja.com/demo/");

    }

    @Test
    public void TutorialsTest() {

        //HomePage
        LOGGER.info("Clicking Components and Monitors");
        TutorialsHomePage tutorialsHomePage=new TutorialsHomePage(driver);
        tutorialsHomePage.ClickComponents();
//      WebDriverWait wait = new WebDriverWait(driver,10);
        tutorialsHomePage.ClickMonitors();


        //MonitorsPage
        LOGGER.info("Selecting AppleCinema30");
        MonitorsPage monitorsPage = new MonitorsPage(driver);
        //Monitor item = monitorsPage.SelectItem(0);
        driver.manage().timeouts().implicitlyWait( 6, TimeUnit.SECONDS);
        monitorsPage.ProductClick();


        //AddToCartPage
        LOGGER.info("Selecting Options");
        AddToCartPage options = new AddToCartPage(driver);
        options.TextOption ("AbCd");
        options.ClickColorSelect();
        options.selectColor(1);
        options.TextAreaOption("Comments");

        LOGGER.info("Uploading file");
        options.sendKeys();

        //LOGGER.info("Clicking on Upload Alert");
        //options.clickUploadAlert();

        //alert was not found probably because of issue with file upload

        //LOGGER.info("Accepting Upload Alert");
        //options.acceptAlert();

        options.EnterQuantity("2");
        LOGGER.info("Clicking AddToCart button");
        options.ClickAddToCart();

        LOGGER.info("Clicking Cart");
        options.ClickCart();
        options.ClickCheckoutButtonMain();

        //CheckOutPage
        CheckoutPage checkout= new CheckoutPage(driver);
        LOGGER.info("Selecting Guest Checkout");
        checkout.SelectGuestCheckout();
        checkout.ClickGuestContinue();

        //BillingDetailsPage
        BillingDetailsPage billing = new BillingDetailsPage(driver);
        LOGGER.info("Entering billing details");
        billing.InputFirstName ("Kluunnnn");
        billing.InputLastName("Hjiiii");
        billing.InputEmail("ghjjkk@liuy.lv");
        billing.InputTelephone("45789990");
        billing.InputAddress("Brivibas iela 45-61");
        billing.SelectCity();
        billing.selectCity(0);
        billing.SelectPostcode();
        billing.SelectPostcode1050(0);
        billing.SelectCountry();
        billing.SelectLatvia("Latvia");
        billing.SelectZone();
        billing.SelectRigaZone("Rīga");
        billing.ContinueCheckoutButton();

        //DeliveryMethodPage
        DeliveryMethodPage delivery = new DeliveryMethodPage(driver);
        LOGGER.info("Clicking continue with delivery");
        delivery.ClickContinueCheckout();

        //PaymentMethodPage
        PaymentMethodPage payment= new PaymentMethodPage(driver);
        LOGGER.info("Accepting payment method");
        payment.ClickAgree();
        payment.ClickCheckout3();

        //ConfirmOrderPage
        ConfirmOrderPage confirm = new ConfirmOrderPage(driver);
        LOGGER.info("Confirming order");
        confirm.ClickConfirmButton();

        //ConfirmPage
        ConfirmPage confirm1 = new ConfirmPage(driver);
        LOGGER.info("Verifying order placed and empty cart");

        Assertions.assertEquals ("Your order has been placed", confirm1.GetMessageFromPage(), "Text not the same");
        confirm1.ClickCart();
        Assertions.assertEquals ("Your shopping cart is empty!", confirm1.getMessageFromCart(), "Text not the same");
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
}