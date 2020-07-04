package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ClothesWomenPage extends BaseFunc {

    public ClothesWomenPage(WebDriver driver) {
        super(driver);
    }

    //    @FindBy(how = How.XPATH, using = "//div[contains (@class,'product-container')]")
    private List<WebElement> allProductContainers;

    @FindBy(how = How.XPATH, using = "//a[@title='View my shopping cart']")
    private WebElement cartButton;

    public void waitUntilLoaded() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("block_contact_infos")));
        allProductContainers = driver.findElements(By.xpath("//div[contains (@class,'product-container')]"));

    }

    public ProductInfo addToCart(int i) {
        WebElement container = allProductContainers.get(i);
        ProductInfo productInfo = new ProductInfo();

        WebElement priceSpan = container.findElement(By.cssSelector("div.right-block > div > span.price.product-price"));
        productInfo.price = Float.parseFloat(priceSpan.getText().substring(1));

        WebElement titleAnchor = container.findElement(By.xpath("//div[@class='right-block']/h5/a"));
        productInfo.title = titleAnchor.getText();

        Actions actions = new Actions(driver);
        Actions moveCursorToContainer = actions.moveToElement(container);
        moveCursorToContainer.perform();

        WebElement addToCartSpan = driver.findElement(By.linkText("Add to cart"));
        addToCartSpan.click();

        WebElement crossSpan = driver.findElement(By.className("cross"));
        wait.until(ExpectedConditions.visibilityOf(crossSpan));
        crossSpan.click();

        return productInfo;
    }

    public void goToCart() {
        cartButton.click();
    }
}
