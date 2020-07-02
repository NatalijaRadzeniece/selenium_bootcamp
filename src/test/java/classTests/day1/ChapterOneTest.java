package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day1.ChapterOnePage;
import pageObjects.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.chapterOne.isDisplayed(), "Chapter link not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!");

        chapterPage.selectFromSelectTypeDD("Selenium RC");
        Assertions.assertEquals("Hello World!", chapterPage.getTextOfTextBox(), "Texts not the same");

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        Assertions.assertNotNull(textLink);
        chapterPage.printAttributeVerifyButton();

        Assertions.assertNotEquals("yellow", chapterPage.printCssValueguide());
        Assertions.assertFalse(chapterPage.printCssValueguide().equals("yellow"), " some message");
        Assertions.assertTrue(!chapterPage.printCssValueguide().equals("yellow"), " some message");
    }

}
