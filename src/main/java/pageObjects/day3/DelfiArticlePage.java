//package pageObjects.day3;
//
//import core.BaseFunc;
//import model.Article;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import java.util.List;
//
//    public class DelfiArticlePage extends BaseFunc {
//        public DelfiArticlePage(WebDriver driver) {
//        super(driver);
//    }
//
//
//
//    Article article;
//
//    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title mb-3')]")
//    private WebElement tittleAndComment;
//
//        public Article getArticleTitleAndComment(){
//            waitElementAppeared(titleAndComment);
//
//            Article commentCount =  new Article();
//
//            commmentCount.setTittle(tittleAndComment);
//            article.setTitle(titleAndComment.findElement(By.tagName("h1")).getText());
//            List<WebElement> commentElements = titleAndComment.findElements(By.xpath(".//a[contains(@class, 'comment-count')]"));
//            if (commentsArticle.isEmpty()) {
//                article.setCommentNumber(0);
//            } else {
//                article.setCommentNumber(commentElements.get(0).getText());
//            }
//            return article;
//        }
//
//    }
//}
//
//
//
////to fix