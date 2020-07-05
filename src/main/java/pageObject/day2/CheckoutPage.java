package pageObject.day2;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(CheckoutPage.class);

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@id='collapse-checkout-option']//div[2]//label[1]//input[1]")
    private WebElement guestcheckout;

    @FindBy(how = How.XPATH, using = "//input[@id='button-account']")
    private WebElement buttonContinue;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-firstname']")
    private WebElement name;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-lastname']")
    private WebElement lastname;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-telephone']")
    private WebElement telephone;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-address-1']")
    private WebElement address;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-city']")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//input[@id='input-payment-postcode']")
    private WebElement postcode;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'Latvia')]")
    private WebElement country;

    @FindBy(how = How.XPATH, using = "//select[@id='input-payment-zone']//option[129]")
    private WebElement region;

    @FindBy(how = How.XPATH, using = "//input[@id='button-guest']")
    private WebElement personalContinue;

    @FindBy(how = How.XPATH, using = "//input[@id='button-shipping-method']")
    private WebElement buttonContinueDelivery;

    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement checkAgree;


    @FindBy(how = How.XPATH, using = "//input[@id='button-payment-method']")
    private WebElement buttonContinuePayment;

    @FindBy(how = How.XPATH, using = "//input[@id='button-confirm']")
    private WebElement buttonConfirm;


    public void checkoutConfig() {
        waitElementAppeared(guestcheckout);
        guestcheckout.click();
        buttonContinue.click();


    }

    public void setPersonalDetails() {
        waitElementAppeared(name);
        name.sendKeys("Raisa");
        lastname.sendKeys("Nazarova");
        email.sendKeys("nazarova.raisa@gmail.com");
        telephone.sendKeys("29776976");
        address.sendKeys("Brivibas 1");
        city.sendKeys("Riga");
        postcode.sendKeys("LV-1010");
        country.click();
        waitElementAppeared(region);
        region.click();

        personalContinue.click();

    }

    public void deliveryContinue() {
        waitElementAppeared(buttonContinueDelivery);
        buttonContinueDelivery.click();

    }

    public void paymentMethod() {
        waitElementAppeared(checkAgree);
        checkAgree.click();
        buttonContinuePayment.click();
        waitElementAppeared(buttonConfirm);
        buttonConfirm.click();


    }


//    public void setSelect() {
//        country.click();


    }

