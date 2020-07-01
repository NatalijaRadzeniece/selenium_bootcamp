package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
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
//dday2 acivity2
        //assert sample
        Assertions.assertTrue(homePage.chapterOne.isDisplayed(), "Chapter link not displayed");
        //asert sample end
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!!");
        //day2.1 finishing DD
        chapterPage.selectFromSelectTypeDD("Selenium RC");

//day2start
        Assertions.assertEquals("Hello World!!", chapterPage.getTextOfTextBox(), "Text not the same");
        chapterPage.getTextOfTextBox();

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        Assertions.assertNotNull(textLink);
        Assertions.assertNotEquals("yellow", chapterPage.printCssValueguide());
//also can be->    Assertions.assertFalse(chapterPage.printCssValueguide().equals("yellow"), "some msg";);
//day2end          Assertions.asertTrue(!chapterPage.printCssValueguide().equals("yellow"), "some msg";);

        chapterPage.printAttributeVerifyButton();
        chapterPage.printCssValueguide();
    }

}
