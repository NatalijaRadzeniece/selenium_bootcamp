package classTests.day1.activities;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

// import org.testng.asserts.Assertion;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk");
    }

    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.chapter1.isDisplayed(), "Chapter Link not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBoxText("Hello World!!");


        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        chapterPage.selectFromSelectTypeDD("Selenium RD");
        Assertions.assertEquals("Hello World!!", chapterPage.getTextofTextBox());

        //  Assertions.assertNotNull(textLink);
        //  chapterPage.printAttributeVerifyButton();


        Assert.assertNotEquals("text 1", "text 2", "Error message");
        Assert.assertTrue(1 < 2, "Error message");
    }
}