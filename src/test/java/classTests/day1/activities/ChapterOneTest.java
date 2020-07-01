package classTests.day1.activities;

import baseWebTest.BaseWebTest;
import day1.ChapterOnePage;
import day1.HomePage;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {

        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.chapter1.isDisplayed(), "Chapter One not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("And His Name Is JOHN CENA!!!");

        Assertions.assertEquals("And His Name Is JOHN CENA!!!", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.selectFromSelectType("Selenium RC");

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();
        Assertions.assertNotNull(textLink);

        chapterPage.getAttributeOfVerifyButton();
        chapterPage.getCssValueOfMainHeading();

        Assertions.assertNotEquals("yellow", chapterPage.getCssValueOfMainHeading());
        Assertions.assertFalse(chapterPage.getCssValueOfMainHeading().equals("yellow"), "some message");
        Assertions.assertTrue(!chapterPage.getCssValueOfMainHeading().equals("yellow"), "some message");

    }


}
