package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.DelfiHomePage;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void articleTest() {
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(5);
        System.out.println(articleHome.getTitle() + "\n" + articleHome.getCommentNumber());
    }
}