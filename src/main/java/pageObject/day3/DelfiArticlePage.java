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

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title')]")
    private WebElement theArticleField;


    public Article getArticleTitleAndCommentNumber() {
        waitElementAppeared(theArticleField);

        Article theArticle = new Article();
        theArticle.setTitle(theArticleField.findElement(By.xpath(".//h1")).getText());
        List<WebElement> commentElement = theArticleField.findElements(By.xpath(".//a[contains(@class, 'text-red-ribbon d-print-none')]"));
        if (commentElement.isEmpty()) {
            theArticle.setCommentNumber(0);
        } else {
            theArticle.setCommentNumber(commentElement.get(0).getText());
        }

        return theArticle;
    }
}
