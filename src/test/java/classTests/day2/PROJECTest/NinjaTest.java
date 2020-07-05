package classTests.day2.PROJECTest;

import baseWebTest.BaseWebTest;
import classTests.day3.StoreTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.PROJECT.NinjaApplePage;
import pageObject.day2.PROJECT.NinjaHomePage;
import pageObject.day2.PROJECT.NinjaMonitorsPage;

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
        LOGGER.info("Clicking radio button");
        applePage.clickMediumRadioButton();
        LOGGER.info("Clicking checkbox");
        applePage.clickOnCheckBox3();
        LOGGER.info("Clearing text box");
        applePage.clearTextBox();
        LOGGER.info("Writing text box");
        applePage.writeText();
        LOGGER.info("Selecting option");
        applePage.selectOption();
        LOGGER.info("Writing textarea");
        applePage.writeTextarea();
        LOGGER.info("Uploading file");
        applePage.clickFileUpload();
        LOGGER.info("Selecting date");
        applePage.selectDate();
        LOGGER.info("Selecting time");
        applePage.selectTime();
        LOGGER.info("Selecting datetime");
        applePage.selectDateAndTime();
        LOGGER.info("Adding to cart");
        applePage.clickAddToCartButton();
        LOGGER.info("Clicking on cart button");
        applePage.clickCartButton();
        LOGGER.info("Clicking on checkout button");
        applePage.clickCheckoutButton();

    }

}
