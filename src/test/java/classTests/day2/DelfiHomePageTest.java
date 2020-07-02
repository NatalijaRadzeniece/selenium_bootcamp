package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DelfiHomePageTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://www.delfi.lv/");
    }

    @Test
    public void checkingDelfi(){
        DelfiHomePage homePage = new DelfiHomePage(driver);
       // homePage.selectMenuItem("Versijas");
        homePage.clickArticle(5);
    }


}
