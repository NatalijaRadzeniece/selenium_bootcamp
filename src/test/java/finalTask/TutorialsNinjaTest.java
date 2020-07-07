package finalTask;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.FinalTask.TutorialsNinjaPurchaseFinalPage;
import pageObject.FinalTask.TutorialsNinjaHeader;
import pageObject.FinalTask.TutorialsNinjaPurchasePage;
import pageObject.FinalTask.TutorialsNinjaProductPage;

import java.util.Map;

public class TutorialsNinjaTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(TutorialsNinjaTest.class);

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void checkingNinja(){
        LOGGER.info("Initialize all variable and pages");
        TutorialsNinjaHeader header = new TutorialsNinjaHeader(driver);
        TutorialsNinjaProductPage productPage = new TutorialsNinjaProductPage(driver);
        TutorialsNinjaPurchasePage purchasePage = new TutorialsNinjaPurchasePage(driver);
        TutorialsNinjaPurchaseFinalPage successPage = new TutorialsNinjaPurchaseFinalPage(driver);

        String textValue = "something";
        String selectValue = "Blue (+$3.60)";
        String textAreaValue = "Selenium";
        String date = "2020-07-06";
        String time = "00:05";
        String dateAndTime = "2020-07-06 00:05";
        String quantity = "2";
        String name = "Nice";
        String surname = "Test";
        String email = "boroboro@london.com";
        String telephone = "377776660102";
        String address = "World Street 3a";
        String city = "Earth";
        String postCode = "EU-777";
        String country = "Ukraine";
        String state = "Kyiv";

        LOGGER.info("Select monitors category");
        header.selectMonitors();

        LOGGER.info("Select Apple Monitor");
        productPage.selectAppleMonitor();

        LOGGER.info("Order Apple Monitor");
        productPage.orderAppleMonitor(textValue, selectValue, textAreaValue, date, time, dateAndTime, quantity);

        LOGGER.info("Check out from the cart");
        header.checkOut();

        LOGGER.info("Purchase monitor");
        purchasePage.enterPurchaseDetails(name, surname, email, telephone, address, city, postCode, country, state);

        LOGGER.info("Assert purchase details");
        Map<String, String> purchaseDetails = purchasePage.getPurchaseDetails();
        Assertions.assertEquals(purchaseDetails.get("Radio"), "Medium");
        Assertions.assertEquals(purchaseDetails.get("Checkbox"), "Checkbox 3");
        Assertions.assertEquals(purchaseDetails.get("Text"), textValue);
        Assertions.assertEquals(purchaseDetails.get("Select"), "Blue");
        Assertions.assertEquals(purchaseDetails.get("Textarea"), textAreaValue);
        Assertions.assertEquals(purchaseDetails.get("Date"), date);
        Assertions.assertEquals(purchaseDetails.get("Time"), time);
        Assertions.assertEquals(purchaseDetails.get("DateAndTime"), dateAndTime);
        Assertions.assertEquals(purchasePage.getPurchaseQuantity(), quantity);

        LOGGER.info("Confirm purchase");
        purchasePage.confirmPurchase();

        LOGGER.info("Wait for page upload");
        successPage.waitForPage();

        LOGGER.info("Assert confirmation message");
        Assertions.assertEquals(successPage.getConfirmationTitle(), "Your order has been placed!");
        Assertions.assertEquals(successPage.getConfirmationMessage(), "Your order has been successfully processed!");

        LOGGER.info("Finish purchase");
        successPage.finishPurchase();

        LOGGER.info("Cart is empty");
        Assertions.assertEquals(header.getCartMessage(), "Your shopping cart is empty!");
    }
}
