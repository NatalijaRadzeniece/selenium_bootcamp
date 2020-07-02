package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePageNew extends BaseFunc {

    public DelfiArticlePageNew(WebDriver driver) {
        super(driver);
    }

//    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'pale-sky py-3 px-2')]")
//    private List<WebElement> menuItems;
//
//    @FindBy(how = How.XPATH, using = "//h1[contains(@class, 'headline__title')]")
//    private List<WebElement> articles;

    @FindBy(how = How.TAG_NAME, using = "article")
    private List<WebElement> articlesFull;

//    public void selectMenuItem(String menuName) {
//        for (WebElement element : menuItems) {
//            String itemName = element.getText();
//            if (menuName.equals(itemName)) {
//                element.click();
//                break;
//            }
//        }
//   }

    public void clickArticle(int i) {
        articlesFull.get(i).click();
    }

    public String getArticleTitle(int i) {
       return articlesFull.get(i).findElement(By.tagName("h1")).getText();
    }

    public int getArticleCommentCount(int i) {
        String s = articlesFull.get(i).findElement(By.xpath("//a[contains(@class, 'comment-count')]")).getText();
        String clearNumber = s.substring(1,s.length()-1);
        return Integer.valueOf(clearNumber);

    }
}
