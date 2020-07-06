package pageObjects.HomeWork;

import core.BaseFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.day2.UploadPage;

import java.util.ListIterator;


public class ProductPage extends BaseFunc {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

//    String theFilepath = System.getProperty("user.dir") + "\\src\\resources\\magic.jpg";

    @FindBy(how = How.XPATH, using = "//input[@name='option[218]' and @value='7']")
    private WebElement radioBtn;

    public void clickRadioBtn() {
        radioBtn.click();
    }


    @FindBy(how = How.XPATH, using = "//input[@name='option[223][]' and @value='11']")
    private WebElement checkBox;

    public void clickCheckBox() {
        checkBox.click();
    }

    @FindBy(how = How.ID, using = "input-option217")
    private WebElement selectDD;

    public void selectFromDD(String optionName1) {
        selectByVisibletext(selectDD, optionName1);
    }


    @FindBy(how = How.CSS, using = "[id='input-option209']")
    private WebElement txtBox;

    public void setTxtToBox(String txtToSend) {
        txtBox.sendKeys(txtToSend);
    }


    @FindBy(how = How.XPATH, using = "//button[@id='button-upload222']")
    private WebElement uploadFileBtn;

    public void sendTheFile() {
        uploadFileBtn.click();
    }

    @FindBy(how = How.ID, using = "input-option219")
    private WebElement clickDate;

    public void setDatePicker(String date) {
        clickDate.clear();
        clickDate.sendKeys(date);
    }

    @FindBy(how = How.NAME, using = "option[221]")
    private WebElement clickTimeBar;

    public void setTime(String time) {
        clickTimeBar.clear();
        clickTimeBar.sendKeys(time);
    }

    @FindBy(how = How.ID, using = "input-option220")
    private WebElement clickTimeDateBar;

    public void setTimeDate(String timeAndDate) {
        clickTimeDateBar.clear();
        clickTimeDateBar.sendKeys(timeAndDate);
    }

    @FindBy(how = How.ID, using = "input-quantity")
    private WebElement clickQty;

    public void setQty(String quantity) {
        clickQty.clear();
        clickQty.sendKeys(quantity);
    }

    @FindBy(how = How.ID, using = "button-cart")
    private WebElement clickAddToCart;

    public void clickAddToCartBtn() {
        clickAddToCart.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'shopping cart')]")
    private WebElement shoppingCartBtn;

    public void clickShoppingCartBtn() {
        waitElementAppeared(shoppingCartBtn);
        shoppingCartBtn.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Checkout')]")
    private WebElement checkoutBtn;

    public void clickCheckoutBtn() {
        waitElementAppeared(checkoutBtn);
        checkoutBtn.click();
    }

}
