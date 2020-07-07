package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class TutorialsNinjaPurchasePage extends BaseFunc {
    public TutorialsNinjaPurchasePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@value='guest']")
    private WebElement guestCheckbox;
    @FindBy(how = How.XPATH, using = "//div[@class='panel-collapse collapse in']//input[@value='Continue']")
    private WebElement customerContinueButton;
    @FindBy(how = How.ID, using = "input-payment-firstname")
    private WebElement firstNameField;
    @FindBy(how = How.ID, using = "input-payment-lastname")
    private WebElement lastNameField;
    @FindBy(how = How.ID, using = "input-payment-email")
    private WebElement emailField;
    @FindBy(how = How.ID, using = "input-payment-telephone")
    private WebElement telephoneField;
    @FindBy(how = How.ID, using = "input-payment-address-1")
    private WebElement addressOneField;
    @FindBy(how = How.ID, using = "input-payment-city")
    private WebElement cityField;
    @FindBy(how = How.ID, using = "input-payment-postcode")
    private WebElement postCodeField;
    @FindBy(how = How.ID, using = "input-payment-country")
    private WebElement countryDropdown;
    @FindBy(how = How.ID, using = "input-payment-zone")
    private WebElement stateDropdown;
    @FindBy(how = How.XPATH, using = "//input[@type='button' and @id='button-guest']")
    private WebElement billingDetailsContinueButton;
    @FindBy(how = How.XPATH, using = "//input[@type='button' and @id='button-shipping-method']")
    private WebElement deliveryMethodContinueButton;
    @FindBy(how = How.NAME, using = "agree")
    private WebElement termsAndConditionsCheckbox;
    @FindBy(how = How.XPATH, using = "//input[@type='button' and @id='button-payment-method']")
    private WebElement paymentMethodContinueButton;
    @FindBy(how = How.XPATH, using = "//input[@type='button' and @id='button-confirm']")
    private WebElement confirmOrderButton;
    @FindBy(how = How.XPATH, using = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[1]")
    private WebElement purchaseDetails;
    @FindBy(how = How.XPATH, using = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[3]")
    private WebElement purchaseQuantity;

    public void enterPurchaseDetails(String firstName, String lastName, String email, String telephone, String address,
                                  String city, String postCode, String country, String state) {
        guestCheckbox.click();
        customerContinueButton.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        telephoneField.sendKeys(telephone);
        addressOneField.sendKeys(address);
        cityField.sendKeys(city);
        postCodeField.sendKeys(postCode);

        Select countrySlc = new Select(countryDropdown);
        countrySlc.selectByVisibleText(country);

        Select stateSlc = new Select(stateDropdown);
        stateSlc.selectByVisibleText(state);

        billingDetailsContinueButton.click();
        deliveryMethodContinueButton.click();
        termsAndConditionsCheckbox.click();
        paymentMethodContinueButton.click();
    }

    public Map<String, String> getPurchaseDetails() {
        Map<String, String> mapOfDetails = new HashMap<>();
        mapOfDetails.put("Radio" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Radio:')]")).getAttribute("textContent"). replace(" - Radio: ", ""));
        mapOfDetails.put("Checkbox" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Checkbox:')]")).getAttribute("textContent"). replace(" - Checkbox: ", ""));
        mapOfDetails.put("Text" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Text:')]")).getAttribute("textContent"). replace(" - Text: ", ""));
        mapOfDetails.put("Select" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Select:')]")).getAttribute("textContent"). replace(" - Select: ", ""));
        mapOfDetails.put("Textarea" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Textarea:')]")).getAttribute("textContent"). replace(" - Textarea: ", ""));
        mapOfDetails.put("Date" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Date:')]")).getAttribute("textContent"). replace(" - Date: ", ""));
        mapOfDetails.put("Time" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Time:')]")).getAttribute("textContent"). replace(" - Time: ", ""));
        mapOfDetails.put("DateAndTime" , purchaseDetails.findElement(By.xpath("//small[contains(text(), 'Date & Time:')]")).getAttribute("textContent"). replace(" - Date & Time: ", ""));
        return mapOfDetails;
    }

    public String getPurchaseQuantity() {
        return purchaseQuantity.getText();
    }

    public void confirmPurchase() {
        confirmOrderButton.click();
    }
}



