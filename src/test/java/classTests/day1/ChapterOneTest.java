package classTests.day1;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);

        chapterPage.setTextBox("Texxttt");
        chapterPage.getTextOfWindowLink();
        chapterPage.getAttribute();
        chapterPage.getCssValue();
    }
}