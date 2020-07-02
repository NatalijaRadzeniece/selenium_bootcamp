package classTests.day3;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.HomePage;
import pageObject.day3.ItemPage;
import pageObject.day3.ItemSizePage;
import pageObject.day3.WomanPage;

public class WomanTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testWomenButtonClick(){
        WomanPage womanPage = new WomanPage(driver);
        womanPage.clickWomenButton();

        ItemPage itemPage = new ItemPage(driver);
        itemPage.clickItem(1);
//
//        ItemSizePage itemSizePage = new ItemSizePage(driver);
//        itemSizePage.clickSizeSelector();
//        itemSizePage.clickSelectedSize();
//        itemSizePage.clickAddToCart();
//        itemSizePage.clickContinueShopping();
//
//        womanPage.clickWomenButton();
//
//        itemPage.clickItem(6);
//
//        itemSizePage.clickSizeSelector();
//        itemSizePage.clickSelectedSize();
//        itemSizePage.clickAddToCart();
//        itemSizePage.clickContinueShopping();

        womanPage.clickShoppingCart();

    }
}
