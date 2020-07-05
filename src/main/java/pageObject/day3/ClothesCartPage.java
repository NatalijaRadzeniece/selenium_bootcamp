package pageObject.day3;

import core.BaseFunc;
import model.ProductInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ClothesCartPage extends BaseFunc {

    public ClothesCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//tr[starts-with(@id, 'product_')]")
    private List<WebElement> allCartItems;

    public ProductInfo getProductInfo(int i) {
        WebElement cartItem = allCartItems.get(i);
        ProductInfo productInfo = new ProductInfo();

        WebElement titleAnchor = cartItem.findElement(By.cssSelector("p.product-name > a"));
        productInfo.title = titleAnchor.getText();

        WebElement priceSpan = cartItem.findElement(By.cssSelector("span.price > span.price"));
        productInfo.price = Float.parseFloat(priceSpan.getText().substring(1));

        return productInfo;
    }
}
