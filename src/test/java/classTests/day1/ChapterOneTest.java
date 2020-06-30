package classTests.day1;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }
    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickChapterOne(); //connect the test to the pages

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!");

        chapterPage.getTextOfWindowLink();
        chapterPage.printAttributeVerifyButton();
        chapterPage.printCssValueguide();
    }

}
