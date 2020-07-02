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

public class ItemCartPage extends BaseFunc {
    public ItemCartPage(WebDriver driver) {
        super(driver);
    }
    Item item;

    @FindBy(how = How.ID, using = "summary_products_quantity")
    private WebElement itemQuantity;

    @FindBy(how = How.CLASS_NAME, using = "product-name")
    private List<WebElement> itemTitles;

    @FindBy(how = How.ID, using = "total_product_price_2_7_0")
    private WebElement itemOnePrice;

    @FindBy(how = How.ID, using = "total_product_price_7_34_0")
    private WebElement itemTwoPrice;

    @FindBy(how = How.ID, using = "total_price")
    private WebElement totalPrice;

    public String getProductQuantity(){
        return itemQuantity.getText();
    }

    public String getProductOnePrice(){
        return itemOnePrice.getText();
    }

    public String getProductTwoPrice(){
        return itemTwoPrice.getText();
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public Item getProductOneName(Integer i) {
        Item oneItem = new Item();
        WebElement item = itemTitles.get(i);
        List<WebElement> oneItems = item.findElements(By.xpath(".//a[text()='Blouse']"));
        item.getText();
        return oneItem;
    }

    public Item getProductTwoName(Integer i) {
        Item twoItem = new Item();
        WebElement item = itemTitles.get(i);
        List<WebElement> oneItems = item.findElements(By.xpath(".//a[text()='Printed Chiffon Dress']"));
        item.getText();
        return twoItem;
    }
}
