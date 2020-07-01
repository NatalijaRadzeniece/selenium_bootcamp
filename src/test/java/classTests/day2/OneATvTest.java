package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.OneATvPage;

public class OneATvTest extends BaseWebTest {

    @BeforeClass
    public void  navigateTo(){
        navigateTo("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
    }
    @Test
    public void findItem(){
        OneATvPage oneATvPage = new OneATvPage(driver);
        oneATvPage.printProductDetails( 8);
    }
}
