package classTests.Day3;

import baseWebTest.BaseWebTest;
import classTests.day1.activities.ElementTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day3.ClothesPage;

public class ClothesTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(ClothesTest.class);

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void checkingClothes(){
        ClothesPage page = new ClothesPage(driver);

        LOGGER.info("Clicking women tab, clicking blouse, adding it to cart, and continue");
        page.selectFirstItem();
        LOGGER.info("Clicking Chiffon Dress, adding it to cart and proceeding to checkout");
        page.selectSecondItem();
        LOGGER.info("Checking if the test passes");
        page.assertResults();

        LOGGER.info("Checking if all the items in the cart are equal to the items chosen by Name, Quantity and Price");
        Assertions.assertEquals(page.getFirstProductName(), "Printed Chiffon Dress");
        Assertions.assertEquals(page.getSecondProductName(), "Blouse");
        Assertions.assertEquals(page.getProductQuantityNumber(), "2 Products");
        Assertions.assertEquals(page.getFirstProductPrice(), "$16.40");
        Assertions.assertEquals(page.getSecondProductPrice(), "$27.00");
        Assertions.assertEquals(page.getTotalPrice(), "$45.40");
    }
}
