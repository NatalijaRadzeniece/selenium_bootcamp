package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.OneATvPage;

public class OneLvProductTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
    }

    @Test
    public void tvTest() {
        OneATvPage tvPage = new OneATvPage(driver);
        tvPage.printProductDetails(24);
    }
}
