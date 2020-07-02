package pageObjects.day2;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiHomePage extends BaseFunc {
    public DelfiHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[contains(@class, ' pale-sky py-3 px-2')]")
    private List<WebElement> menuItems;

    @FindBy(how = How.XPATH, using = "//h1[contains(@class, 'headline__title')]")
    private List<WebElement> articles;
    //day3 add:
    @FindBy(how = How.TAG_NAME, using = "article")
    private List<WebElement> articlesFull;
//
    public void selectMenuItem(String menuName){
        for (WebElement element: menuItems){
            String itemName = element.getText();
            if(menuName.equals(itemName)){
                element.click();
                break;
            }
        }
    }
    public void clickArticle(int i){
//  long  WebElement article = articles.get(i);
//        article.click();
        articles.get(i).click();
    }
    //day3:
    public Article getArticleTitleAndComment(Integer i){
        Article commentCount = new Article();

        WebElement article = articlesFull.get(i);
        commentCount.setTitle(article.findElement(By.tagName("h1")).getText());

        List<WebElement> commentElements = article.findElements(By.xpath(".//a[contains(@class, 'comment-count')]"));
        if (commentElements.isEmpty()) {
            commentCount.setCommentNumber(0);
//            System.out.println(commentElements.get(0).getText());
        } else {
//            System.out.println("0");
            commentCount.setCommentNumber(commentElements.get(0).getText());
        }
        return commentCount;
//        System.out.println(title);
    }
}

