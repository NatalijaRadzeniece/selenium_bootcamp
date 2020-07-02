package pageObject.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiSecondPage extends BaseFunc {
    public DelfiSecondPage(WebDriver driver) {
        super(driver);
    }

    Article article;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title mb-3 ')]")
    private WebElement titleAndComment;

    public Article getArticleAttributes() {

        waitElementAppeared(titleAndComment);

        article = new Article();
        article.setTitle(titleAndComment.findElement(By.tagName("h1")).getText());
        List<WebElement> commentElements = titleAndComment.findElements(By.xpath(".//a[@class='text-size-19 text-size-md-28 text-red-ribbon d-print-none']"));
        if (commentElements.isEmpty()) {
            article.setCommentNumber(0);
        } else {
            article.setCommentNumber(commentElements.get(0).getText());
        }
        return article;
    }
}
