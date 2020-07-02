package pageObject.day2;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.util.List;

public class DelfiHomePage extends BaseFunc {
    public DelfiHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'pale-sky py-3 px-2')]")
    private List<WebElement> menuItems;

    @FindBy(how = How.XPATH, using = "//h1[contains(@class, 'headline__title')]")
    private List<WebElement> articles;

    @FindBy(how = How.TAG_NAME, using = "article")
    private List<WebElement> articleFull;


    public void selectMenuIteam(String menuName) {
        for (WebElement element : menuItems) {
            String itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
    }

    public void clickArticles(int i) {
        articles.get(i).click();
    }

    public Article getArticleTitleAndComment(Integer i) {
        Article commentCount = new Article();

        WebElement article = articleFull.get(i);
        //String title = articleFull.get(4).;
        commentCount.setTitle(article.findElement(By.tagName("h1")).getText());

        List<WebElement> commentElements = article.findElements(By.xpath(".//a[contains(@class, 'comment-count')]"));
        if (commentElements.isEmpty()) {
            commentCount.setCommentNumber(0);
            //System.out.println(commentElements.get(0).getText());

        } else {
            //System.out.println("0");
            commentCount.setCommentNumber(commentElements.get(0).getText());

        }
        //System.out.println("title");
        article.click();
        return commentCount;

    }
}
