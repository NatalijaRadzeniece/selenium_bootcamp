package classTests.day2;


import PageObject.Day_2.OneATvPage;
import baseWebTest.BaseWebTest;
import core.BaseFunc;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OneTvProductTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo ("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");

    }
    @Test
    public void checkingOneTv(){

        OneATvPage homePage=new OneATvPage(driver);
        homePage.printProductDetails(5);

    }
}


