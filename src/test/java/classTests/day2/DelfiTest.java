package classTests.day2;

import baseWebTest.BaseWebTest;
import pageObject.Day2.DelfiHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DelfiTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void checkingDelfi(){
        DelfiHomePage homePage = new DelfiHomePage(driver);

        //homePage.selectMenuItem("Versijas");
        homePage.clickArticle(5);
    }
}
