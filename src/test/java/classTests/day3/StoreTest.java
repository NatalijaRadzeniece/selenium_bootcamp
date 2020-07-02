package classTests.day3;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.OneATvPage;
import pageObjects.day3.SelectClothingPage;
import pageObjects.day3.StoreHomePage;

public class StoreTest extends BaseWebTest {


    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testStorePage() {
        StoreHomePage homePage = new StoreHomePage(driver);
        homePage.clickOnButtonWoman();


        SelectClothingPage clothingPage = new SelectClothingPage(driver);
        clothingPage.addProductToCart();

    }
}
