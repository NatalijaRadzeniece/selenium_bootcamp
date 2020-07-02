package classTests.Day3;

import Model.Article;
import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.DelfiHomePage;
import pageObject.Day3.DelfiArticlePageSolo;

public class ArticleTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void articleTest() {
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(3);
        DelfiArticlePageSolo delfiArticlePageSolo = new DelfiArticlePageSolo(driver);
        Article articleArticle = delfiArticlePageSolo.getArticleTitleAndComment();
        Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(), "Amount of comments not the same");

    }
}
