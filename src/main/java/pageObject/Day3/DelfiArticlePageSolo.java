package pageObject.Day3;

import Model.Article;
import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePageSolo extends BaseFunc {

    public DelfiArticlePageSolo(WebDriver driver) {
        super(driver);
    }
    Article article;


    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title mb-3')]")
    private WebElement articlesSolo;



    public Article getArticleTitleAndComment() {
        waitElementAppeared(articlesSolo);
        article = new Article();
        article.setTitle(articlesSolo.findElement(By.xpath(".//h1")).getText());
        List<WebElement> commentElements = articlesSolo.findElements(By.xpath(".//a[contains(@class, 'text-red-ribbon d-print-none')]"));
        if (commentElements.isEmpty()) {
            article.setCommentNumber(0);
        } else {
            article.setCommentNumber(commentElements.get(0).getText());
        }
        return article;
    }
}
