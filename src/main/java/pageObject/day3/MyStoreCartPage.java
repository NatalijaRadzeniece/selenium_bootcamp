package pageObject.day3;

import core.BaseFunc;
import model.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyStoreCartPage extends BaseFunc {

    public MyStoreCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//td[@class='cart_description']")
    private WebElement productName;

    @FindBy(how = How.XPATH, using = "//td[@class='cart_total']")
    private WebElement productPrice;

    public Products getProductNameAndPrice() {
        Products theProduct = new Products();
        waitElementAppeared(productName);
        theProduct.setProductName(productName.findElement(By.xpath(".//p")).getText());
        theProduct.setPrice(productPrice.getText());
        return theProduct;
    }
}
