package pageObject.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class ArticlePage extends BaseFunc {

    public ArticlePage (WebDriver driver) {
        super(driver);
    }
    Article article;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'article-title mb-3')]")
    private WebElement titleAndComment;

    public Article getArticleAtributes(){
        waitElementAppeared(titleAndComment);
        article = new Article();
        article.setTitle(titleAndComment.findElement(By.xpath(".//h1")).getText());
        List<WebElement> commentsArticle = titleAndComment.findElements(By.xpath(".//a[contains(@class, 'text-red-ribbon d-print-none')]"));
        if (commentsArticle.isEmpty()) {
            article.setCommentNumber("(0)");
        }
        else{
                article.setCommentNumber(commentsArticle.get(0).getText());
            }
            return article;
        }
    }



