package pageObject.day2;

import core.BaseFunc;
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

    public void selectMenuItems(String menuName){
        for (WebElement element:menuItems) {
            String itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
    }

    public void clickArticle(int i){
        articles.get(i).click();
    }
}
