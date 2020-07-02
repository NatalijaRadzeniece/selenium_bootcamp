package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;
import pageObject.day3.DelfiArticlePage;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void ArticlesTest() {
        DelfiHomePage delfiHomePage = new DelfiHomePage(driver);
        Article articleHome = delfiHomePage.getArticleTitleAndCommentNumber(0);
//        System.out.println(articleHome.getTitle() + "\n" + articleHome.getCommentNumber());


        DelfiArticlePage delfiArticlePage = new DelfiArticlePage(driver);
        Article articlePage = delfiArticlePage.getArticleTitleAndCommentNumber();
//        System.out.println(articlePage.getTitle() + "\n" + articlePage.getCommentNumber());

        Assertions.assertEquals(articleHome.getTitle(), articlePage.getTitle(), "Articles not the same");
        Assertions.assertEquals(articleHome.getCommentNumber(), articlePage.getCommentNumber(), "Amount of comments not the same");
    }
}
