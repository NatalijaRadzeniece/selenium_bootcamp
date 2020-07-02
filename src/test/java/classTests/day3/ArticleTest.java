package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.day2.DelfiHomepage;
import pageObject.day3.DelfiSecondPage;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void articleTest() {
        DelfiHomepage homepage = new DelfiHomepage(driver);
//        copiy our object model - article.java
        //taht is test class created object model is actually one from Page class (DelfiHomePage.class)
        Article articleHome = homepage.getArticleTitleAndComment(4);

        DelfiSecondPage delfiSecondPage = new DelfiSecondPage(driver);

        Article articleArticle = delfiSecondPage.getArticleAttributes();

        Assertions.assertNotEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(), "Amount of comments not same");
    }
}
