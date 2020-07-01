package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.DelfiHomePage;
import pageObject.Day2.OneATvPage;

public class OneLVProductTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
}
    @Test
    public void tvTest(){
        OneATvPage tvPage = new OneATvPage(driver);
        // homePage.selectMenuItem(("Ārzemēs"))
        tvPage.printProductDetails(24);
    }
}