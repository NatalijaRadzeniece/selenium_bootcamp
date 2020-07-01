package classTests.day1;

import PageObject.Day_1.ChapterOnePage;
import PageObject.Day_1.HomePage;
import baseWebTest.BaseWebTest;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChapterOneTest extends BaseWebTest {


    @BeforeClass
    public void navigateTo() {

        navigateTo("http://book.theautomatedtester.co.uk/");

    }

    @Test
    public void ChapterOneTest() {
        HomePage homePage = new HomePage (driver);
        Assertions.assertTrue(homePage.chapterOne.isDisplayed (), "Chapter link not displayed ");

        homePage.clickChapterOne();


        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello world!");

        chapterPage.setSelectTypeDD ("Selenium IDE");

        Assertions.assertEquals ("Hello world!", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.getTextOfTextWindowLink();
        String textLink=chapterPage.getTextOfTextWindowLink();

        Assertions.assertNotNull(textLink);

        chapterPage.printAttributeVerifyButton();

        Assertions.assertEquals( "yellow", chapterPage.printCssValueGuide());
        Assertions.assertFalse(chapterPage.printCssValueGuide().equals ("yellow"), "some message");
        Assertions.assertTrue(!chapterPage.printCssValueGuide().equals ("yellow"), "some message");



    }
}