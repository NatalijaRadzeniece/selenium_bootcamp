package classTests.day2;

import baseWebTest.BaseWebTest;
import pageObject.Day2.DelfiHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.OneATvPage;

public class OneATvTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
    }

    @Test
    public void checkingOneA() {
        OneATvPage tvPage = new OneATvPage(driver);

        tvPage.printProductDetails(30);
    }
}