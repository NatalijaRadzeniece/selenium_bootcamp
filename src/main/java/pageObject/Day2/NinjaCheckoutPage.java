package pageObject.Day2;

import org.openqa.selenium.*;
import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NinjaCheckoutPage extends BaseFunc {
    public NinjaCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@value='guest']")
    private WebElement radioButtonGuest;

    public void clickRadioButtonGuest() {
        waitElementAppeared(radioButtonGuest);
        radioButtonGuest.click();
    }

    @FindBy(how = How.ID, using = "button-account")
    private WebElement buttonContinue;

    public void clickButtonContinue() {
        buttonContinue.click();
    }

    @FindBy(how = How.ID, using = "input-payment-firstname")
    private WebElement textFirstName;

    public void setTextFirstName(String textToFirstName) {
        waitElementAppeared(textFirstName);
        textFirstName.clear();
        textFirstName.sendKeys(textToFirstName);
    }

    @FindBy(how = How.ID, using = "input-payment-lastname")
    private WebElement textLastName;

    public void setTextLastName(String textToLastName) {
        textLastName.clear();
        textLastName.sendKeys(textToLastName);
    }

    @FindBy(how = How.ID, using = "input-payment-email")
    private WebElement textEmail;

    public void setTextEmail(String textToEmail) {
        textEmail.clear();
        textEmail.sendKeys(textToEmail);
    }

    @FindBy(how = How.ID, using = "input-payment-telephone")
    private WebElement textPhone;

    public void setTextPhone(String textToPhone) {
        textPhone.clear();
        textPhone.sendKeys(textToPhone);
    }

//    @FindBy(how = How.ID, using = "input-payment-password")
//    private WebElement textPassword;
//
//    public void setTextPassword(String textToPassword) {
//        textPassword.clear();
//        textPassword.sendKeys(textToPassword);
//    }
//
//    @FindBy(how = How.ID, using = "input-payment-confirm")
//    private WebElement textPasswordConfirm;
//
//    public void setTextPasswordConfirm(String textToPasswordConfirm) {
//        textPasswordConfirm.clear();
//        textPasswordConfirm.sendKeys(textToPasswordConfirm);
//    }

    @FindBy(how = How.ID, using = "input-payment-address-1")
    private WebElement textAddress;

    public void setTextAddress(String textToAddress) {
        textAddress.clear();
        textAddress.sendKeys(textToAddress);
    }

    @FindBy(how = How.ID, using = "input-payment-city")
    private WebElement textCity;

    public void setTextCity(String textToCity) {
        textCity.clear();
        textCity.sendKeys(textToCity);
    }

    @FindBy(how = How.ID, using = "input-payment-postcode")
    private WebElement textPostcode;

    public void setTextPostcode(String textToPostcode) {
        textPostcode.clear();
        textPostcode.sendKeys(textToPostcode);
    }

    @FindBy(how = How.ID, using = "input-payment-country")
    private WebElement selectCountryDD;

    public void selectFromCountryDD(String optionName){
        selectByVisibleText(selectCountryDD, optionName);
    }

    @FindBy(how = How.ID, using = "input-payment-zone")
    private WebElement selectRegionDD;

    public void selectFromRegionDD(String optionName){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        selectByVisibleText(selectRegionDD, optionName);
    }
//
//    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
//    private WebElement checkBoxAgree;
//
//    public void clickCheckBoxAgree() {
//        checkBoxAgree.click();
//    }

    @FindBy(how = How.ID, using = "button-guest")
    private WebElement buttonRegister;

    public void clickButtonRegister() {
        buttonRegister.click();
    }

//    @FindBy(how = How.ID, using = "button-shipping-address")
//    private WebElement buttonShippingAddress;
////using = "button-shipping-address"
//    public void clickButtonShippingAddress() {
//        waitElementAppeared(buttonShippingAddress);
//        buttonShippingAddress.click();
//    }
    @FindBy(how = How.ID, using = "button-shipping-method")
    private WebElement buttonShippingMethod;

    public void clickButtonShippingMethod() {
        waitElementAppeared(buttonShippingMethod);
        buttonShippingMethod.click();
    }

    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement checkAgreeTerms;

    public void clickCheckAgreeTerms() {
        waitElementAppeared(checkAgreeTerms);
        checkAgreeTerms.click();
    }

    @FindBy(how = How.ID, using = "button-payment-method")
    private WebElement buttonPaymentMethod;

    public void clickButtonPaymentMethod() {
        buttonPaymentMethod.click();
    }

    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered table-hover']")
    private WebElement productTable;

    public String getTitleProductTable() {
        //WebElement title = productTitle.get(i);
        waitElementAppeared(productTable);
        String title = productTable.findElement(By.xpath(".//a[contains(@href, 'product_id=42')]")).getText();
        return title;
    }

    @FindBy(how = How.XPATH, using = ".//tbody//td[@class='text-right']")
    private List<WebElement> productQuantity;

    public String getProductQuantity(){
        String quantity= productQuantity.get(10).getText();
        return quantity;
    }

    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement buttonConfirmMethod;

    public void clickButtonConfirmMethod() {
        waitElementAppeared(buttonConfirmMethod);
        buttonConfirmMethod.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@href, 'success')]")
    private WebElement success;

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cartTotal;

    public String getCartTotal(){
        waitElementAppeared(success);
        String total= cartTotal.getText();
        return total;
    }

    @FindBy(how = How.XPATH, using = "//div/h1")
    private List <WebElement> listContained;
    public String getMessageContained() {
        String message = listContained.get(1).getText();
        return message;
    }

}