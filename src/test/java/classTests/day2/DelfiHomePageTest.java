package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;

public class DelfiHomePageTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void checkingDelfi(){
        DelfiHomePage delfiHomePage = new DelfiHomePage(driver);

//        delfiHomePage.selectMenuItem("Ārzemēs");
//        delfiHomePage.clickArticle(4);

    }

}
