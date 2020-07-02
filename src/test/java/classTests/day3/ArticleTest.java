package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void articleTest() {
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(4);
        System.out.println(articleHome.getTitle() + "\n" + articleHome.getCommentNumber());
    }

    @Test
    public void delfiHomePageTest(){
        DelfiHomePage homePage = new DelfiHomePage(driver);


    }

}
//[3:15 PM] Radzeniece, Natalija (Guest)
//
//
//        DelfiHomePage homePage = new DelfiHomePage(driver);
//// Copy of our object model - Article.java
////That in Test class created Object model is actually one from Page class ( DelfiHomePage.class)
//        Article articleHome = homePage.getArticleTitleAndComment(4);
//        DelfiArticlePage delfiArticlePage = new DelfiArticlePage(driver);
//        Article articleArticle =  delfiArticlePage.getArticleAttributes();
//        Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
//        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(), "Amount of comments not the same");
//


