package pageObject.day3;

import core.BaseFunc;
import model.Article;
import model.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ItemPage extends BaseFunc {
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    Item item;


    @FindBy(how = How.XPATH, using = "//a[@class='product-name']")
    private List<WebElement> items;

    public void clickItemOne(int i) {
        waitForTheListOfElements(items);

        items.get(i).click();
    }

    public Item getMyItem(Integer i) {
        Item myItem = new Item();
        WebElement item = items.get(i);
        List<WebElement> myItems = item.findElements(By.(".//a[text()='Blouse']"));
        item.click();
        return myItem;
    }

    public Item getMyItem2(Integer i) {
        Item myItem = new Item();
        WebElement item = items.get(i);
        List<WebElement> myItems = item.findElements(By.xpath(".//a[@title='Printed Chiffon Dress']"));
        item.click();
        return myItem;
    }
}

