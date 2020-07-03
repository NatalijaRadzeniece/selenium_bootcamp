package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.AlertPage;
import pageObject.Day2.NinjaPage;

public class NinjaPageTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28");
    }

    @Test
    public void shopTvTest() {
        NinjaPage ninjaPage = new NinjaPage(driver);
        ninjaPage.clickButtonFromList(1);

//        public void waitUntilOfVisibility(){
//            wait.until(ExpectedConditions.visibilityOf(ninjaPage.radioButtons));
//        }
        ninjaPage.clickRadioButton(1);
    }
}