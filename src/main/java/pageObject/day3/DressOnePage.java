package pageObject.day3;

import core.BaseFunc;
import model.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.security.PublicKey;

public class DressOnePage extends BaseFunc {

    public DressOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[@name='Submit']")
    private WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//span[@class = 'cross']")
    private WebElement crossButton;

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement menuWomen;

    @FindBy(how = How.XPATH, using = "//h1")
    private WebElement productName;

    @FindBy(how = How.XPATH, using = "//span[@id='our_price_display']")
    private WebElement productPrice;

    @FindBy(how = How.XPATH, using = "//a[contains(@title, 'shopping cart')]")
    private WebElement cartButton;


    public void clickOnAddButton() {
        waitElementAppeared(addToCart);
        addToCart.click();
    }

    public void clickOnCrossButton() {
        waitElementAppeared(crossButton);
        crossButton.click();
    }

    public void clickOnMenuWomen() {
        menuWomen.click();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }

    public Products getProductNameAndPrice() {
        Products theProduct = new Products();
        theProduct.setProductName(productName.getText());
        theProduct.setPrice(productPrice.getText());
        return theProduct;
    }
}
