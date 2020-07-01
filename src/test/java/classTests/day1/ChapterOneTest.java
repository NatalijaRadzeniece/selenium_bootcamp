package classTests.day1;

import baseWebTest.BaseWebTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }
    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.chapter1.isDisplayed(),"Chapter link now displayed");

        homePage.clickChapterOne(); //connect the test to the pages

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!");
        chapterPage.selectFromSelectTypeDD("Selenium IDE");

        Assert.assertEquals("Hello World!", chapterPage.getTextOfTextBox(), "Texts not the same");

        chapterPage.getTextOfTextBox();

        chapterPage.getTextOfWindowLink();


        chapterPage.printAttributeVerifyButton();
        chapterPage.printCssValueguide();
    }

}
