package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.Day2.AlertPage;
import pageObject.Day2.NinjaCheckoutPage;
import pageObject.Day2.NinjaPage;
import org.apache.logging.log4j.Logger;
import pageObject.Day2.UploadPage;
import pageObject.day1.ChapterOnePage;
import org.junit.jupiter.api.Assertions;

public class NinjaPageTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28");
    }

    @Test
    public void shopTvTest() throws InterruptedException {
        NinjaPage ninjaPage = new NinjaPage(driver);
        LOGGER.info("Getting title of TV to choose");
        String tv = ninjaPage.getTVname();
        LOGGER.info("Choose Apple Tv 30");
        ninjaPage.clickAddAppleTV();
        LOGGER.info("Choose size from radiobutton");
        ninjaPage.clickRadioButton(1);
        LOGGER.info("Choose checkbox");
        ninjaPage.clickCheckBox(2);
        LOGGER.info("Populating text");
        ninjaPage.setTextBox("Have a nice day!");
        LOGGER.info("Select dropdown color");
        ninjaPage.selectFromSelectColor("Blue\n" +
                "                                (+$3.60)\n" +
                "                 ");
        LOGGER.info("Populating text area");
        ninjaPage.setTextBoxSecond("Deliver ASAP");
        LOGGER.info("Uploading file");
        ninjaPage.setFile();
        LOGGER.info("Set date");
        ninjaPage.setDateBox("2020-07-05");
        LOGGER.info("Set time");
        ninjaPage.setTimeBox("17:30");
        LOGGER.info("Set date and time");
        ninjaPage.setDateAndTimeBox("2020-07-05 17:30");
        LOGGER.info("Set quantity");
        ninjaPage.setInputQuantity("3");
        LOGGER.info("Click button Add to Cart");
        ninjaPage.clickButtonAddCart();
        LOGGER.info("Click button Checkout");
        ninjaPage.clickButtonCheckout();

        LOGGER.info("At checkout page");
        NinjaCheckoutPage ninjaCheckoutPage = new NinjaCheckoutPage(driver);
        LOGGER.info("Click radiobutton Guest checkout");
        ninjaCheckoutPage.clickRadioButtonGuest();
        LOGGER.info("Click button Continue");
        ninjaCheckoutPage.clickButtonContinue();
        LOGGER.info("Populate First Name");
        ninjaCheckoutPage.setTextFirstName("Mila");
        LOGGER.info("Populate Last Name");
        ninjaCheckoutPage.setTextLastName("Kravcenk");
        LOGGER.info("Populate email");
        ninjaCheckoutPage.setTextEmail("tabh97@inbox.lv");
        LOGGER.info("Populate phone");
        ninjaCheckoutPage.setTextPhone("2525257363");
        //ninjaCheckoutPage.setTextPassword("12345");
       // ninjaCheckoutPage.setTextPasswordConfirm("12345");
        LOGGER.info("Populate address");
        ninjaCheckoutPage.setTextAddress("Liepas 7");
        LOGGER.info("Populate city");
        ninjaCheckoutPage.setTextCity("Riga");
        LOGGER.info("Populate post code");
        ninjaCheckoutPage.setTextPostcode("MO 003");
        LOGGER.info("Choose country form dropdown");
        ninjaCheckoutPage.selectFromCountryDD("Latvia");
        LOGGER.info("Choose region form dropdown");
        ninjaCheckoutPage.selectFromRegionDD("Valmiera");
        //ninjaCheckoutPage.clickCheckBoxAgree();
        LOGGER.info("Click button continue");
        ninjaCheckoutPage.clickButtonRegister();
       // ninjaCheckoutPage.clickButtonShippingAddress();
        LOGGER.info("Click button continue");
        ninjaCheckoutPage.clickButtonShippingMethod();
        LOGGER.info("Check box Terms and conditions");
        ninjaCheckoutPage.clickCheckAgreeTerms();
        LOGGER.info("Click button continue");
        ninjaCheckoutPage.clickButtonPaymentMethod();
        LOGGER.info("Checking if product title at checkout is the same as chosen from first page");
        Assertions.assertEquals(tv, ninjaCheckoutPage.getTitleProductTable(), "Product not matches actual choice");
        LOGGER.info("Checking if product count at checkout is the same as populated before");
        Assertions.assertEquals("3",ninjaCheckoutPage.getProductQuantity(),"Quantity is incorrect");
        LOGGER.info("Click confirm order");
        ninjaCheckoutPage.clickButtonConfirmMethod();
        LOGGER.info("Checking that cart is empty");
        Assertions.assertEquals("0 item(s) - $0.00", ninjaCheckoutPage.getCartTotal(), "Cart is not empty");
        LOGGER.info("Checking order placed successfully");
        Assertions.assertEquals("Your order has been placed!", ninjaCheckoutPage.getMessageContained(), "Order is not placed");
    }
}