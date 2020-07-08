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


    @FindBy(how = How.XPATH, using = "//div[@class='product-container']")
    private List<WebElement> items;

    @FindBy(how = How.XPATH, using = "//div[@class='button-container']")
    private WebElement buttonContainer;


    public void clickOnItem(int i) {
        waitForTheListOfElements(items);
        WebElement item = items.get(i);
        item.findElement(By.xpath(".//img[@class='replace-2x img-responsive'']"));
        waitElementAppeared(item);
        items.get(i).click();
    }

//    public void clickOnMore(){
//        waitElementAppeared(buttonContainer);
//        buttonContainer.findElement(By.xpath(".//span[text()='More']")).click();
//    }

//    public Item getMyItem(Integer i) {
//        waitForTheListOfElements(items);
//        Item myItem = new Item();
//        WebElement item = items.get(i);
//        List<WebElement> myItems = item.findElements(By.xpath("//span[contains(text(),'More')]"));
//        item.click(i);
//        return myItem;
//    }

//    public Item getMyItem2(Integer i) {
//        Item myItem = new Item();
//        WebElement item = items.get(i);
//        List<WebElement> myItems = item.findElements(By.xpath(".//a[@title='Printed Chiffon Dress']"));
//        item.click();
//        return myItem;
}

