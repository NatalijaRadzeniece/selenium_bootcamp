package classTests.day3;

import baseWebTest.BaseWebTest;
import classTests.day2.DelfiHomePage;
import model.Article;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://www.delfi.lv/");
    }

    @Test
    public void articleTest(){
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(4);
        System.out.println(articleHome.getTitle() + "\n" + articleHome.getCommentNumber());
    }


}
