package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Products;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.day3.DressOnePage;
import pageObject.day3.MyStoreCartPage;
import pageObject.day3.MyStoreHomePage;
import pageObject.day3.MyStoreWomenPage;


public class MyStoreTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(MyStoreTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void MyStorePages() {
        LOGGER.info("Initializing MyStore Home Page");
        MyStoreHomePage myStoreHomePage = new MyStoreHomePage(driver);
        LOGGER.info("Clicking on Women Menu Button");
        myStoreHomePage.clickOnMenuWomen();

        LOGGER.info("Initializing MyStore Women Page");
        MyStoreWomenPage myStoreWomenPage = new MyStoreWomenPage(driver);
        LOGGER.info("Select the product");
        myStoreWomenPage.selectProduct(0);

        LOGGER.info("Initializing Product Page");
        DressOnePage dressOnePage = new DressOnePage(driver);

        LOGGER.info("Clicking on Add Button");
        dressOnePage.clickOnAddButton();
        LOGGER.info("Clicking on Cross Button");
        dressOnePage.clickOnCrossButton();
        LOGGER.info("Getting Name and Price of thr Product ");
        Products theProduct = dressOnePage.getProductNameAndPrice();
        LOGGER.info("Clicking on Cart Button");
        dressOnePage.clickOnCartButton();
//        dressOnePage.clickOnMenuWomen();

        LOGGER.info("Initializing MyStore Cart Page");
        MyStoreCartPage myStoreCartPage = new MyStoreCartPage(driver);
        LOGGER.info("Getting Name and Price of thr Product on Cart Page");
        Products theProductInCart = myStoreCartPage.getProductNameAndPrice();

        LOGGER.info("Assertion of Product Name");
        Assertions.assertEquals(theProduct.getProductName(), theProductInCart.getProductName(), "Product Names are not the same");
        LOGGER.info("Assertion of Product Price");
        Assertions.assertEquals(theProduct.getPrice(), theProductInCart.getPrice(), "Product prices are not the same");
//        MyStoreWomenPage myStoreWomenPage1 = new MyStoreWomenPage(driver);
//        myStoreWomenPage1.selectProduct(4);
    }
}