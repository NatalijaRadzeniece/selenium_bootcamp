package pageObject.day2.work_EOD;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage extends BaseFunc {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@value='guest']")
    private WebElement GuestOption;

    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    private WebElement continueClick;

    @FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    private WebElement inputFirstName;

    @FindBy(how = How.XPATH, using = "//input[@name='lastname']")
    private WebElement inputLastName;

    @FindBy(how = How.ID, using = "input-payment-email")
    private WebElement inputMail;

    @FindBy(how = How.XPATH, using = "//input[@name='telephone']")
    private WebElement inputTel;

    @FindBy(how = How.XPATH, using = "//input[@name='address_1']")
    private WebElement inputAdress;

    @FindBy(how = How.XPATH, using = "//input[@name='city']")
    private WebElement inputCity;

    @FindBy(how = How.XPATH, using = "//input[@name='postcode']")
    private WebElement inputPostcode;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-country']")
    public WebElement country;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-country']/option[126]")
    public WebElement dropLat;

    @FindBy(how = How.XPATH, using = "//select[@id='input-payment-zone']//option[45]")
    private WebElement region;

    @FindBy(how = How.XPATH, using = "//*[@id='button-guest']")
    public WebElement continueClick2;

    @FindBy(how = How.XPATH, using = "//*[@id='button-shipping-method']")
    public WebElement continueClick3;

    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement acceptLaw;

    @FindBy(how = How.ID, using = "button-payment-method")
    private WebElement continueClick4;

    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement continueClick5;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Your order has been placed!')]")
    private WebElement success;


    public void ChooseGuest(){
        GuestOption.click();
    }

public void contClick(){
        continueClick.click();
}

    public void inputBillingDetalis(String firstName, String lastName, String mail, String telephone, String address, String city, String postcode ) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputMail.sendKeys(mail);
        inputTel.sendKeys(telephone);
        inputAdress.sendKeys(address);
        inputCity.sendKeys(city);
        inputPostcode.sendKeys(postcode);
    }

    public void chooseCountry() {
        country.click();
        dropLat.click();
    }

    public void chooseRegion() throws InterruptedException {
        Thread.sleep(2000);
        region.click();
    }

    public void continueclicking2() {
        continueClick2.click();
    }

    public void continueclicking3() {
        continueClick3.click();
    }

    public void acceptinTermsCond() {
        acceptLaw.click();
    }

    public void continueClicking4() {
        continueClick4.click();
    }

    public void continueClicking5() {
        continueClick5.click();
    }

    public String getSuccessText() {
        return success.getText();

    }


}
