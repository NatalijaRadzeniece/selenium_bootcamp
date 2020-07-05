package classTests.day2;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.*;

public class NinjaTest extends BaseWebTest {


    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }


    @Test
    public void testNinjaPage() {
        NinjaHomePage webstoreNinja = new NinjaHomePage(driver);

        webstoreNinja.clickOnComponents();
        webstoreNinja.clickOnMonitors();

        StoreMonitorsPage addCartpage = new StoreMonitorsPage(driver);
        addCartpage.clickOnaddCart();

        AppleConfigPage configurations = new AppleConfigPage(driver);
        configurations.clickOnConfig();

        configurations.setSelect();
        configurations.setText();

        configurations.upload();

        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.alertIsPresent());

        AlertPage alertPage = new AlertPage(driver);
        alertPage.acceptAlert();

        configurations.clickAddToCart();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkoutConfig();


        checkoutPage.setPersonalDetails();

        checkoutPage.deliveryContinue();

        checkoutPage.paymentMethod();

        OrderPlacesPage orderPlacesPage = new OrderPlacesPage(driver);
        Assertions.assertEquals("Your order has been placed!", orderPlacesPage.getTextFromOrderElements(),"Error" );
        Assertions.assertEquals("0 item(s) - $0.00", orderPlacesPage.verifyEmptyCard(),"Error" );

    }

}





