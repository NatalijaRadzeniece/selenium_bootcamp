package pageObject.homeworkMonitor;

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

    @FindBy(how = How.XPATH, using = "//input[@value='guest']")
    private WebElement guestCheckoutButton;

    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    private WebElement continueButton;

    @FindBy(how = How.ID, using = "account")
    private WebElement personalDetailsInput;

    @FindBy(how = How.ID, using = "address")
    private WebElement yourAddressInput;

    @FindBy(how = How.XPATH, using = "//select[@name='country_id']")
    private WebElement countryInput;

    @FindBy(how = How.NAME, using = "zone_id")
    private WebElement regionStateInput;

    @FindBy(how = How.XPATH, using = "//input[@id='button-guest']")
    private WebElement continueBut;

    @FindBy(how = How.ID, using = "button-shipping-method")
    private WebElement continueShippingButton;

    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement agreeTermsAndCond;

    @FindBy(how = How.ID, using = "button-payment-method")
    private WebElement continuePaymentButton;

    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement confirmOrderButton;

    @FindBy(how = How.XPATH, using = "//div[@class='panel-body']")
    private WebElement checkoutCategories;

    public void clickGuestCheckout() {
        waitElementAppeared(guestCheckoutButton);
        guestCheckoutButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void insertYourPersonalDetails(String firstName, String lastName, String email, String telephone) {
        waitElementAppeared(personalDetailsInput);
        personalDetailsInput.findElement(By.name("firstname")).sendKeys(firstName);
        personalDetailsInput.findElement(By.name("lastname")).sendKeys(lastName);
        personalDetailsInput.findElement(By.id("input-payment-email")).sendKeys(email);
        personalDetailsInput.findElement(By.name("telephone")).sendKeys(telephone);
    }

    public void insertYourAddress(String address1, String city, String postcode) {
        yourAddressInput.findElement(By.name("address_1")).sendKeys(address1);
        yourAddressInput.findElement(By.name("city")).sendKeys(city);
        yourAddressInput.findElement(By.name("postcode")).sendKeys(postcode);
    }

    public void selectCountry (String conID){
        Select select = new Select(countryInput);
        select.selectByVisibleText(conID);
    }

    public void selectRegionStateInput(String ID){
        regionStateInput.click();
        Select select = new Select(regionStateInput);
        select.selectByVisibleText(ID);
    }

    public void clickContinueBut() {
        continueBut.click();
    }

    public void clickContShipButton() {
        waitElementAppeared(continueShippingButton);
        continueShippingButton.click();
    }

    public void clickAgreeTermsAndCond() {
        waitElementAppeared(agreeTermsAndCond);
        agreeTermsAndCond.click();
    }

    public void clickContPayButton() {
        continuePaymentButton.click();
    }

    public void clickConfirmOrderButton() {
        waitElementAppeared(confirmOrderButton);
        confirmOrderButton.click();
    }

    public String getRadioSize(){
        waitElementAppeared(checkoutCategories);
        return checkoutCategories.findElement(By.xpath(".//td//small[contains(.,'Radio:')]")).getText();
    }

    public String getCheckboxNumber(){
         return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Checkbox:')]")).getText();
    }

    public String getTextInput(){
         return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Text:')]")).getText();
    }

    public String getSelectColor(){
        return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Select:')]")).getText();
    }

    public String getTextArea(){
        return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Textarea:')]")).getText();
    }

    public String getUploadedFile(){
        return checkoutCategories.findElement(By.xpath(".//small[contains(.,'File:')]")).getText();
    }

    public String getDate(){
        return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Date:')]")).getText();
    }

    public String getTime(){
        return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Time:')]")).getText();
    }

    public String getDateTime(){
        return checkoutCategories.findElement(By.xpath(".//small[contains(.,'Date & Time:')]")).getText();
    }

}
