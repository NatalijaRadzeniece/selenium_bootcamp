package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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

        Assertions.assertTrue(homePage.chapterOne.isDisplayed(), "Chapter link not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello world!");

        chapterPage.selectFromSelectTypeDD("Selenium RC");
        Assertions.assertEquals("Hello world!", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();
        Assertions.assertNotNull(textLink,"Link window text not empty");

        chapterPage.printAttributeVerifyButton();
        chapterPage.printCssValueguide();
        Assertions.assertNotEquals("yellow", chapterPage.printCssValueguide(), "Color is yellow" );

    }


}
