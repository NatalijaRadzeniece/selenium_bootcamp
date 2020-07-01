package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.Chapter1;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo (){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }
    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.chapter1.isDisplayed(), "Chapter Link not displayed");
        homePage.clickChapter1();

        Chapter1 chapterPage = new Chapter1(driver);
        chapterPage.setTextBox("Hello World!");

        chapterPage.selectFromSelectTypeDD("Selenium RC");
        Assertions.assertEquals("Hello World!", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        Assertions.assertNotNull(textLink);
        chapterPage.getAttributeVerifyButton();

        Assertions.assertNotEquals("yellow", chapterPage.printCssValueguide());
        Assertions.assertFalse(chapterPage.printCssValueguide().equals("yellow"),"some message");
        Assertions.assertTrue(!chapterPage.printCssValueguide().equals("yellow"), "some message");
        chapterPage.selectFromSelectTypeDD("Selenium Core");

    }

}
