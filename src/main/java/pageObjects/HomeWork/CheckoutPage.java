package pageObjects.HomeWork;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BaseFunc {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='guest']")
    private WebElement guestCheckoutBtn;

    public void clickGuestCheckout() {
        waitElementAppeared(guestCheckoutBtn);
        guestCheckoutBtn.click();
    }

    @FindBy(how = How.ID, using = "button-account")
    private WebElement continueBtn;

    public void clickContinueBtn() {
        continueBtn.click();
    }

    @FindBy(how = How.NAME, using = "firstname")
    private WebElement firstNameField;

    public void setFirstNameField(String name) {
        firstNameField.sendKeys(name);
    }

    @FindBy(how = How.NAME, using = "lastname")
    private WebElement lastNameField;

    public void setLastNameField(String lastname) {
        lastNameField.sendKeys(lastname);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='email' and @id='input-payment-email']")
    private WebElement emailField;

    public void setEmailField(String email) {
        emailField.sendKeys(email);
    }

    @FindBy(how = How.NAME, using = "telephone")
    private WebElement telField;

    public void setTelField(String tel) {
        telField.sendKeys(tel);
    }

    @FindBy(how = How.NAME, using = "address_1")
    private WebElement addressField;

    public void setAddressField(String address) {
        addressField.sendKeys(address);
    }

    @FindBy(how = How.NAME, using = "city")
    private WebElement cityField;

    public void setCityField(String city) {
        cityField.sendKeys(city);
    }

    @FindBy(how = How.NAME, using = "postcode")
    private WebElement postCodeField;

    public void setPostCodeField(String postcode) {
        postCodeField.sendKeys(postcode);
    }

    @FindBy(how = How.ID, using = "button-guest")
    private WebElement continueDeliveryBtn;

    public void clickContinueDeliveryBtn() {
        continueDeliveryBtn.click();
    }

    @FindBy(how = How.ID, using = "button-shipping-method")
    private WebElement continueShippingBtn;

    public void clickContinueShippingBtn() {
        continueShippingBtn.click();
    }

    @FindBy(how = How.NAME, using = "agree")
    private WebElement agreeCheckBox;

    public void clickAgreeCheckBox() {
        agreeCheckBox.click();
    }

    @FindBy(how = How.ID, using = "button-payment-method")
    private WebElement continuePaymentBtn;

    public void clickContinuePaymentBtn() {
        continuePaymentBtn.click();
    }

    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement confirmOrdertBtn;

    public void clickConfirmOrderBtn() {
        confirmOrdertBtn.click();
    }
}
