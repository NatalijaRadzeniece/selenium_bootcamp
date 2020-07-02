package pageObject.Day3;

import core.BaseFunc;

import Model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClothesPage extends BaseFunc {
    public ClothesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[(@title='Women')]")
    private WebElement women;
    @FindBy(how = How.XPATH, using = "//a[@class='product-name' and @title='Blouse']")
    private WebElement blouse;
    @FindBy(how = How.XPATH, using = "//span[@class='cat-name']")
    private WebElement womenPage;
    @FindBy(how = How.XPATH, using = "//button[@name='Submit']")
    private WebElement itemAddCart;
    @FindBy(how = How.XPATH, using = "//span[@class='continue btn btn-default button exclusive-medium']")
    private WebElement continueShopping;
    @FindBy(how = How.XPATH, using = "//a[@class='product-name' and @title='Printed Chiffon Dress']")
    private WebElement printedChiffonDress;
    @FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckout;
    @FindBy(how = How.XPATH, using = "//tr[@id='product_7_34_0_0']//p[@class='product-name']")
    private WebElement firstProductName;
    @FindBy(how = How.XPATH, using = "//tr[@id='product_2_7_0_0']//p[@class='product-name']")
    private WebElement secondProductName;
    @FindBy(how = How.XPATH, using = "//span[@id='summary_products_quantity']")
    private WebElement quantityCheck;
    @FindBy(how = How.XPATH, using = "//span[@id='total_product_price_7_34_0']")
    private WebElement firstProductPrice;
    @FindBy(how = How.XPATH, using = "//span[@id='total_product_price_2_7_0']")
    private WebElement secondProductPrice;
    //@FindBy(how = How.XPATH, using = "//div[@class='pb-center-column col-xs-12 col-sm-4']")
   // private WebElement productPage;
    @FindBy(how = How.XPATH, using = "//span[@id='total_price']")
    private WebElement totalPrice;


    public void selectFirstItem() {
        women.click();
        waitElementAppeared(womenPage);
        blouse.click();
       // waitElementAppeared(productPage);
        itemAddCart.click();
        continueShopping.click();
        getDriver().navigate().back();
    }

    public void selectSecondItem(){
        printedChiffonDress.click();
       // waitElementAppeared(productPage);
        itemAddCart.click();
        proceedToCheckout.click();
    }

    public void assertResults() {
    }

    public String getFirstProductName(){
        return firstProductName.getText();
    }
    public String getSecondProductName(){
        return secondProductName.getText();
        }
    public String getProductQuantityNumber(){
        return quantityCheck.getText();
    }
    public String getFirstProductPrice(){
        return firstProductPrice.getText();
    }
    public String getSecondProductPrice(){
        return secondProductPrice.getText();
    }
    public String getTotalPrice(){
        return totalPrice.getText();
    }



}