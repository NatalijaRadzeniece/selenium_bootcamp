package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.day3.ArticlePage;
import pageObject.day3.DelfiHomePage;


public class ArticleTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("https://www.delfi.lv/");
    }
    @Test
    public void articleTest(){
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(4);

        homePage.clickArticle(4);
        ArticlePage articlePage = new ArticlePage(driver);

        Article articleArticle = articlePage.getArticleAtributes();

        Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(),"Amount of comments not the same");
        //System.out.println(articleHome.getTitle() + "\n" + articleHome.getCommentNumber());
        //homePage.getArticleText();///change nuber here?
    }
}
