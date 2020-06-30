package classTests.day1;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeTest
    public void navigateTo(){
    navigateTo("http://book.theautomatedtester.co.uk/");
    }
    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickChapterOne();



        ChapterOnePage chapterPage = new ChapterOnePage (driver);
        chapterPage.setTextBox("Hello world!");

        chapterPage.getTextOfWindowLink();

        chapterPage.printAttributeVerifyButton();
        chapterPage.printCssValueguide();
    }


}
