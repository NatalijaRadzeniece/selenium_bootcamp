package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.OneAPcPage;

public class OneAPcPageTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.1a.lv/c/datortehnika-preces-birojam/portativie-datori-un-aksesuari/portativie-datori/2t6");
    }

    @Test
    public void checkingOneA(){
        OneAPcPage oneAPcPage = new OneAPcPage(driver);
        oneAPcPage.printProductDetails(4);
    }
}
