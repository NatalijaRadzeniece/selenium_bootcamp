package pageObject.day2HomeWork;

import core.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObject.day1.HomePage;

import java.util.List;

public class YSCheckoutPage extends BaseFunc {

    public YSCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@value='guest']")
    private WebElement guestRadioButton;

    @FindBy(how = How.ID, using = "button-account")
    private WebElement continueButton;

    @FindBy(how = How.ID, using = "account")
    private WebElement accountFields;

    @FindBy(how = How.ID, using = "address")
    private WebElement addressFields;

    @FindBy(how = How.ID, using = "button-guest")
    public WebElement continueButtonTwo;

    @FindBy(how = How.NAME, using = "country_id")
    private WebElement countries;

    @FindBy(how = How.NAME, using = "zone_id")
    private WebElement zones;

    @FindBy(how = How.ID, using = "button-shipping-method")
    private WebElement continueButtonThree;

    @FindBy(how = How.ID, using = "button-payment-method")
    public WebElement continueButtonFour;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Flat Rate')]")
    private WebElement flatRate;

    @FindBy(how = How.ID, using = "collapse-payment-method")
    private WebElement paymentMethodField;

    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement agree;

    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement confirmButton;


    public void clickGuestRadioButton() {
        waitElementAppeared(guestRadioButton);
        guestRadioButton.click();
    }

    public void clickContinueButton() {
        Assertions.assertTrue(continueButton.isDisplayed(), "Continue Button is not displayed");
        continueButton.click();
    }

    public void populateAccountFields(String name, String lastName, String email, String telephoneNumber) {
        waitElementAppeared(accountFields);
        accountFields.findElement(By.name("firstname")).sendKeys(name);
        accountFields.findElement(By.name("lastname")).sendKeys(lastName);
        accountFields.findElement(By.id("input-payment-email")).sendKeys(email);
        accountFields.findElement(By.name("telephone")).sendKeys(telephoneNumber);
    }

    public void populateAddressFields(String address, String city, String postcode, int countryID, int zoneID) {
        addressFields.findElement(By.name("address_1")).sendKeys(address);
        addressFields.findElement(By.name("city")).sendKeys(city);
        addressFields.findElement(By.name("postcode")).sendKeys(postcode);
        List<WebElement> country = countries.findElements(By.xpath(".//option"));
        country.get(countryID).click();
        zones.click();
        List<WebElement> zone = zones.findElements(By.xpath(".//option"));
        zone.get(zoneID).click();
        continueButtonTwo.click();
    }

    public void passDeliveryMethod(){
        waitElementAppeared(continueButtonThree);
        Assertions.assertTrue(continueButtonThree.isDisplayed(), "Continue Button is not displayed");
        continueButtonThree.click();
    }
    public void passPaymentMethod() {
        waitElementAppeared(agree);
        Assertions.assertTrue(agree.isDisplayed(), "Agree Checkbox is not displayed");
        agree.click();
        continueButtonFour.click();
        waitElementAppeared(confirmButton);
        confirmButton.click();
    }
}

