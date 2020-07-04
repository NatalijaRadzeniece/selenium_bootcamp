package pageObject.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePage extends BaseFunc {

    public DelfiArticlePage(WebDriver driver) {
        super(driver);
    }

    Article article;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title mb-3 ')]")
    private WebElement titleAndComment;

    public Article getArticleAttributes() {
        waitElementAppeared(titleAndComment);

        article = new Article();

        article.setTitle(titleAndComment.findElement(By.xpath(".//h1")).getText());
        List<WebElement> commentsArticle = titleAndComment.findElements(By.xpath(".//a[contains(@class,'text-red-ribbon')]"));
        if (commentsArticle.isEmpty()) {
            article.setCommentNumber(0);
        } else {
            article.setCommentNumber(commentsArticle.get(0).getText());
        }
        return article;
    }


//    @FindBy(how = How.XPATH, using = "//h1[contains(@class, 'headline__title')]")
//    private List<WebElement> articles;
//
//    @FindBy(how = How.TAG_NAME, using = "article")
//    private List<WebElement> articlesFull;
//
//    public void selectMenuItem(String menuName) {
//        for (WebElement element : menuItems) {
//            String itemName = element.getText();
//            if (menuName.equals(itemName)) {
//                element.click();
//                break;
//            }
//        }
//   }
//
//    public void clickArticle(int i) {
//        articlesFull.get(i).click();
//    }
//
//    public String getArticleTitle(int i) {
//       return articlesFull.get(i).findElement(By.tagName("h1")).getText();
//    }
//
//    public int getArticleCommentCount(int i) {
//        String s = articlesFull.get(i).findElement(By.xpath("//a[contains(@class, 'comment-count')]")).getText();
//        String clearNumber = s.substring(1,s.length()-1);
//        return Integer.valueOf(clearNumber);
//
//    }
}
