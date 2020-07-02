package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");

    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.chapter1.isDisplayed(),"Chapter one not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hii there");


        chapterPage.selectFromSelectTypeDD("Selenium RC");

       Assert.assertEquals("Hi there", chapterPage.getTextOfTextBox(),"Texts not the same");
       Assert.assertNotNull(chapterPage.getTextOfWindowLink(), "String is null");
       Assert.assertNotEquals(chapterPage.getColorOfHeading(),"yellow", "Color is just yellow");
       //Assert.assertTrue(chapterPage.getColorOfHeading().equals("yellow"), "some message");
        chapterPage.getTextOfWindowLink();
        chapterPage.getColorOfHeading();
        chapterPage.getAttributeOfButton();


        


    }
}
