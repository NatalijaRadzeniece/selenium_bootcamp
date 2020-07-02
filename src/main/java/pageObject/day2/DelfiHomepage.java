package pageObject.day2;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiHomepage extends BaseFunc {
    public DelfiHomepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'pale-sky py-3 px-2')]")
    private List<WebElement> menuItems;

    @FindBy(how = How.XPATH, using = "//h1[contains(@class, 'headline__title')]")
    private List<WebElement> articles;

    @FindBy(how = How.TAG_NAME, using = "article")
    private List<WebElement> articleFull;

    public void selectMenuItems(String menuName) {
        for (WebElement element : menuItems) {
            String itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
    }

    public void clickArticle(int i) {

        articles.get(i).click();
    }
//after public we specified ....that we want to return Object model
    public Article getArticleTitleAndComment(Integer i) {
        //Article - model Object, and here we created a copy of it, in order to use.
        Article commentCount = new Article();
        //This line we selecting specific Article from Delfi homepage to work with it.
        //get(i) - getting from list bt index specific entry (in our case in Article)
        WebElement article = articleFull.get(i);
        //Setting title name in Object model - method "setTitle()"
        //in set () we first looking for WebElement title (locator "h1") and getting text from it.
        commentCount.setTitle(article.findElement(By.tagName("h1")).getText());
        //We checking is comment number presented at the page.
        //List will not throw error in case if inside Article elementdoes not exist comment element.
        //in such case list will stay empty
        List<WebElement> commentElements = article.findElements(By.xpath(".//a[@class='comment-count text-red-ribbon']"));
        //Is List of comment element is Empty or not.
        //if it is empty IF loop will execute line with "commentCount.setCommentNumber(0);"
        if (commentElements.isEmpty()){
            //if condition is true, this code will be executed
            //letting know our object that comment amount is 0.
            commentCount.setCommentNumber(0);
            //if it meets FALSE - started to work else code.
        } else {
            //in case of FALSE of IF condition, this part will be executed.

            //This line we need to use our Comment Element (if it exists) and getting text number from Comment element tp set it in...
            // object, that we declared (Article commentCount = new Article();)
            //setCommentNumber - functions which set our result in Object model (Article)
            commentCount.setCommentNumber(commentElements.get(0).getText());
        }
        article.click();
        return commentCount;
    }
}
