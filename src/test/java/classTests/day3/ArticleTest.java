package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.DelfiArticlePageNew;
import pageObject.day3.DelfiHomePage;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void articleTest() {
        final int i = 4;
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(i);
        System.out.println(articleHome.getTitle() + "\n" + articleHome.getCommentNumber());
    }
    @Test
    public void articleTestNew() {
        final int i = 4;
        DelfiArticlePageNew homePage = new DelfiArticlePageNew(driver);
        String title = homePage.getArticleTitle(i);
        int commentCount = homePage.getArticleCommentCount(i);


//        Article articleHome = homePage.getArticleTitleAndComment(i);
//        System.out.println(homePage.getArticleTitle(i) + " " + homePage.getArticleCommentCount(i));
    }
//New code starts here:
DelfiHomePage homePage = new DelfiHomePage(driver);
    // Copy of our object model - Article.java
//That in Test class created Object model is actually one from Page class ( DelfiHomePage.class)
    Article articleHome = homePage.getArticleTitleAndComment(4);
    DelfiArticlePage delfiArticlePage = new DelfiArticlePage(driver);
    Article articleArticle =  delfiArticlePage.getArticleAttributes();
Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(), "Amount of comments not the same");
}