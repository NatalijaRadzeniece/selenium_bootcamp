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

    @FindBy(how = How.CLASS_NAME, using = "//table[@id='cart_summary']")
    private List<WebElement> items;

    @FindBy(how = How.ID, using = "total_product_price_2_7_0")
    private WebElement itemOnePrice;

    @FindBy(how = How.ID, using = "total_product_price_7_34_0")
    private WebElement itemTwoPrice;

    @FindBy(how = How.ID, using = "total_price")
    private WebElement totalPrice;

    public String getProductQuantity() {
        return itemQuantity.getText();
    }

    public String getProductOnePrice() {

        return itemOnePrice.getText();
    }

    public String getProductTwoPrice() {
        return itemTwoPrice.getText();
    }

    public Double getTotalPrice() {
        return Double.parseDouble(totalPrice.getText().substring(1));
    }

//    public Item getItem(int i) {
//        Item myItem = new Item();
//        WebElement item = items.get(i);
//        List<WebElement> itemElements = item.findElements(By.xpath("p[@class='product-name']"));
//        item.getText();
//        return itemTitle;
//    }

//    public Item getProductTwoName(int i) {
//        Item itemPrice = new Item();
//        WebElement item = items.get(i);
//        List<WebElement>  = item.findElements(By.xpath(".//a[text()='Printed Chiffon Dress']"));
//        item.getText();
//        return twoItem;
}
