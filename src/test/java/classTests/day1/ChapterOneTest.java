package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo( "http://book.theautomatedtester.co.uk");
    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.chapter1.isDisplayed(),"Chapter not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!!!");

        chapterPage.setSelectTypeDD("Selenium RC");
        Assertions.assertEquals("Hello World!!!", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        Assertions.assertNotNull(textLink);

        chapterPage.printAttributeVerifyButton();

        Assertions.assertNotEquals("yellow", chapterPage.getCssValueOfguide(), "Not the same");


        //chapterPage.getCssValueOfguide();
    }


}
