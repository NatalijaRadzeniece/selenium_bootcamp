package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.DelfiHomePage;

public class DelfiTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://www.delfi.lv");
}

    @Test
    public void checkingDelfi(){
    DelfiHomePage homePage = new DelfiHomePage(driver);
   // homePage.selectMenuItem(("Ārzemēs"));
    homePage.clickArticle(5);
    }
}
