package pageObject.day3;

import core.BaseFunc;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import javax.xml.ws.FaultAction;
import java.util.List;

public class StorePageTwo extends BaseFunc {

    private Actions actions;

    public StorePageTwo(WebDriver driver) {
        super(driver);
        this.actions = new Actions(driver);
    }

    public List<WebElement> getProducts() {
        return products;
    }

    @FindBy(how = How.CSS, using =".ajax_block_product")
    private List<WebElement> products;

    @FindBy(how = How.CSS, using ="ul.product_list")
    private WebElement productList;

    @FindBy(how = How.CSS, using = "span[title='Close window']")
    private WebElement closePopupButton;

    @FindBy(how = How.CSS, using = "a[title='View my shopping cart']")
    private WebElement shoppingCartButton;

  /*  @FindBy(how = How.CSS, using ="a[title='Add to cart']")
    private List<WebElement> addCart;*/

    public void addProductToCart(Integer i) {
        waitElementAppeared(productList);
        WebElement product = products.get(i);
        actions.moveToElement(product).perform();
        WebElement addToCartElement = product.findElement(By.cssSelector("a[title='Add to cart']"));
        addToCartElement.click();
    }

    public void closePopup() {
        waitElementAppeared(closePopupButton);
        closePopupButton.click();
    }

    public void goToShoppingCart() {
        shoppingCartButton.click();
    }

    public Product getProduct(int i) {
        Product product = new Product();

        WebElement productElement = products.get(i);
        product.setTitle(productElement.findElement(By.cssSelector("a.product-name")).getText());
        product.setPrice(productElement.findElement(By.cssSelector("span.product-price")).getText());

        return product;
    }
}
