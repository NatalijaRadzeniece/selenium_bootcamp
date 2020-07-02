package pageObject.day3;

import core.BaseFunc;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class StorePageThree extends BaseFunc {

    public StorePageThree(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using ="tr.cart_item")
    private List<WebElement> products;

    @FindBy(how = How.CSS, using ="td#total_product")
    private WebElement totalPrice;

    public double getTotalPrice() {
        return Double.parseDouble(totalPrice.getText().substring(1));
    }

    public Product getProduct(int i) {
        Product product = new Product();

        WebElement productElement = products.get(i);
        product.setTitle(productElement.findElement(By.cssSelector("p.product-name")).getText());
        product.setPrice(productElement.findElement(By.cssSelector("span.price")).getText());

        return product;
    }
}
