package classTests.day1;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(ChapterOneTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {
        LOGGER.info("Initializing Home Page");
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.chapter1.isDisplayed(), "Chapter1 is not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);

        chapterPage.setTextBox("New Text");
        Assertions.assertEquals("New Text", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.selectFromSelectTypeDD("Selenium IDE");


        chapterPage.getTextOfWindowLink();
        Assertions.assertNotNull(chapterPage.getTextOfWindowLink(), "There is no text");

        chapterPage.getAttribute();

        chapterPage.getCssValue();
        Assertions.assertNotEquals("yellow", chapterPage.getCssValue(), "There should be the yellow color");


    }
}
