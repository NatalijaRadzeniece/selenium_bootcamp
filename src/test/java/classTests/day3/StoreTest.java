package classTests.day3;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.*;

import java.util.ArrayList;

public class StoreTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testStorePage() {
        StoreHomePage webstoreHome = new StoreHomePage(driver);
        webstoreHome.clickOnButtonWomen();

        SecondStorePage secondPage = new SecondStorePage(driver);
        String blouseName = secondPage.clickOnBlouse();

        BuyDressPage buyDressPage = new BuyDressPage(driver);
        String blousePrice = buyDressPage.getPrice();
        buyDressPage.addToCard();

        AfterBuyPage afterBuyPage = new AfterBuyPage(driver);
        afterBuyPage.pressContinueBtn();

        webstoreHome.clickOnButtonWomen();
        String shirtName = secondPage.clickOnShirt();

        String shirtPrice = buyDressPage.getPrice();
        buyDressPage.addToCard();

        afterBuyPage.pressCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        ArrayList<String> nameList = checkoutPage.getDressNameList();

        String totalPrice = checkoutPage.getTotalPrice();
        String shippingPrice = checkoutPage.getShippingPrice();

        double price1 = Double.parseDouble(blousePrice.substring(1));
        double price2 = Double.parseDouble(shirtPrice.substring(1));
        double price3 = Double.parseDouble(shippingPrice.substring(1));
        double allPrice = Double.parseDouble(totalPrice.substring(1));

        double sumPrice = (double) Math.round((price1 + price2 + price3) * 100000d) / 100000d;

        Assertions.assertEquals(sumPrice, allPrice, "Price not the same");
        Assertions.assertEquals(3, nameList.size(), "Wrong count of elements");
        Assertions.assertTrue(nameList.contains(shirtName), "Checkout do not contain shirt");
        Assertions.assertTrue(nameList.contains(blouseName), "Checkout do not contain blouse");
    }
}