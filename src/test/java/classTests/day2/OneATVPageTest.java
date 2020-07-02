package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.OneATVPage;

public class OneATVPageTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo( "https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
    }

    @Test
    public void tvTest(){
        OneATVPage tvPage = new OneATVPage(driver);
        tvPage.printProductDetails( 24);
    }
}
