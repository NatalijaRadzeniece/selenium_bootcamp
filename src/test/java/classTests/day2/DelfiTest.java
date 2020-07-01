package classTests.day2;

import PageObject.Day_2.DelfiHomePage;
import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DelfiTest extends BaseWebTest {


    @BeforeClass
    public void navigateTo() {

        navigateTo("https://www.delfi.lv/");

    }
    @Test
    public void checkingDelfi(){

        DelfiHomePage homePage=new DelfiHomePage(driver);
        //homePage.selectMenuItem("Ārzemēs");
        homePage.clickArticle(15);
    }
}
