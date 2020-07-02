package classTests.day3;

import baseWebTest.BaseWebTest;
import classTests.day2.AlertTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import pageObjects.day3.AddToCartClothing;
import pageObjects.day3.SelectClothingPage;
import pageObjects.day3.StoreHomePage;

public class StoreTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testStorePage() {
        LOGGER.info("Lets buy something");
        StoreHomePage homePage = new StoreHomePage(driver);
        homePage.clickOnButtonWoman();

        SelectClothingPage clothingPage = new SelectClothingPage(driver);
        clothingPage.clickOnShirt();
        clothingPage.clickButtonAddToCart();
        clothingPage.clickContinueShoping();
        clothingPage.clickBackToList();
        clothingPage.clickOnBlouse();
        clothingPage.clickButtonAddToCart();
        clothingPage.clickToCheckout();
        clothingPage.clickToPurchase();
        LOGGER.info("Purchase done");
    }
}
