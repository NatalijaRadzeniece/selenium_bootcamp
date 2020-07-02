package classTests.day2;

import baseWebTest.BaseWebTest;
import core.BaseFunc;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;

public class DelfiTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("https://www.delfi.lv/");

    }

    @Test
    public void checkingDelfi(){
        DelfiHomePage homePage = new DelfiHomePage(driver);

        //homePage.selectMenuIteam("arzemes");
        homePage.clickArticles(11);
    }
}
