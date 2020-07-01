package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.day1.Chapter1Page;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.chapter1.isDisplayed(), "Chapter1 not displayed");
        homePage.clickChapter1();

        Chapter1Page chapterPage = new Chapter1Page(driver);
        chapterPage.setTextBox("Apples and oranges");

        chapterPage.selectFromSelectTypeDD("Selenium RC");

        Assertions.assertEquals("Apples and oranges", chapterPage.getTextOfTextBox(), "Text not same");
        chapterPage.getTextOfTextBox();
        String textLink = chapterPage.getTextOfTextBox();

        Assertions.assertNotNull(textLink);
        chapterPage.getClickLinkLaunchlinText();

        Assertions.assertNotNull(textLink);
        chapterPage.printButtonVerifyAttribute();

        Assertions.assertNotEquals("yellow", chapterPage.beginnersGuide,"does not match color");
        chapterPage.printBeginnersGuidecssValuePrint();
    }
}
