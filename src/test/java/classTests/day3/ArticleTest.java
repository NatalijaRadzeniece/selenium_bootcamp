//package classTests.day3;
//
//import baseWebTest.BaseWebTest;
//import model.Article;
//import org.junit.jupiter.api.Assertions;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import pageObjects.day2.DelfiHomePage;
//import pageObjects.day3.DelfiArticlePage;
//
//public class ArticleTest extends BaseWebTest {
//
//    @BeforeClass
//    public void navigateTo() {
//        navigateTo("https://wwww.delfi.lv");
//    }
//
//
//    @Test
//    public void articleTest() {
//        DelfiHomePage homePage = new DelfiHomePage(driver);
//        // Copy of our object model - Article.java
//        //That in Test class created Object model is actually one from Page class ( DelfiHomePage.class)
//        Article articleHome = homePage.getArticleTitleAndComment(4);
//        DelfiArticlePage delfiArticlePage = new DelfiArticlePage(driver);
//        Article articleArticle = delfiArticlePage.getArticleAttributes();
//        Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
//        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(), "Amount of comments not the same");
//    }
//
//
//}


//to fix