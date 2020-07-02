package classTests.day2HomeWork;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2HomeWork.YSHomePage;

public class YourStoreTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void ysTest() {
        YSHomePage ysHomePage = new YSHomePage(driver);

        Assertions.assertTrue(ysHomePage.componentsMenu.isDisplayed(), "Components button is not displayed");
        ysHomePage.clickComponentsMenu();
    }

}

