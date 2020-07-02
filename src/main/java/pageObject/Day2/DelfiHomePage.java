package pageObject.Day2;

import Model.Article;
import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiHomePage extends BaseFunc {
    public DelfiHomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'pale-sky py-3 px-2')]")
    private List<WebElement> menuItems;
    @FindBy(how = How.XPATH, using = "//h1[contains(@class, 'headline__title')]")
    private List<WebElement> articles;
    @FindBy(how = How.TAG_NAME, using = "article")
    private List<WebElement> articlesFull;


    public void selectMenuItem(String menuName){
        for (WebElement element: menuItems) {
            String itemName = element.getText();
            if(menuName.equals(itemName)){
                element.click();
                break;
            }
        }
    }
    public void clickArticle(int i){
        articles.get(i).click();
    }
    public Article getArticleTitleAndComment(Integer i){
        Article commentCount = new Article();

        WebElement article = articlesFull.get(i);
        commentCount.setTitle(article.findElement(By.tagName("h1")).getText());
        List<WebElement> commentElements = article.findElements(By.xpath(".//a[contains(@class, 'comment-count')]"));
        if (commentElements.isEmpty()){
            commentCount.setCommentNumber(0);
        } else {
            commentCount.setCommentNumber(commentElements.get(0).getText());
        }
        article.click();
        return commentCount;
    }

}
//    //after public we specified that we want to return our Object model (in this case Article.java)
//    public Article getArticleTitleAndComment(Integer i){
//        // Article - model Objects, and here we creating a copy of it, in order to use.
//        Article commentCount = new Article();
//        //This line we selecting specific Article from Delfi Home Page to work with it.
//        // get(i) - getting from list by index specific entry ( in our case it Article).
//        WebElement article = articlesFull.get(i);
//        //Setting title name in Object model - method "setTitle()"
//        //in set () we first looking for WebElement title ( locator "h1") and getting text from it.
//        String title = article.findElement(By.tagName("h1")).getText();
//        commentCount.setTitle(title);
//        //We checking is comment number presented at the page.
//        // List will not throw error in case if inside Article element does not exist comment element.
//        List<WebElement> commentElements = article.findElements(By.xpath(".//a[contains(@class,'comment-count')]"));
//        // is List of comment element is Empty or not.
//        // if it is empty IF loop will execute line with   "commentCount.setCommentNumber(0);"
//        if(commentElements.isEmpty()){
//            // if condition is TRUE, this code will be executed.
//            //letting know to our Object that comment amount is 0.
//            commentCount.setCommentNumber(0);
//        }
//        // if it meets FALSE - started to work else code.
//        else {
//            //in case of FALSE of IF condition, this part will be executed.
//            //This line we need to use our Comment Element (if its exist)
//            WebElement comment = commentElements.get(0);
//            //Getting text number from Comment Element, to set it in Object model ( Article)
//            String commentNumberText = comment.getText();
//            //  commentCount - still name of our Object model, that we declared above ( Article commentCount = new Article();)
//            //setCommentNumber - functions which set our result in Object model (Article)
//            commentCount.setCommentNumber(commentNumberText);
//        }
//        article.click();
//
//        //returning our Object model ( Article.java) in order to use in Test class.
//        return commentCount;
//    }
