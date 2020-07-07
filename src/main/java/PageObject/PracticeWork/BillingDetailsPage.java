package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BillingDetailsPage extends BaseFunc {
    public BillingDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.ID, using = "input-payment-firstname")
    private WebElement firstName;

    public void InputFirstName (String textToSend) {
        firstName.sendKeys(textToSend);
    }
    @FindBy(how = How.ID, using = "input-payment-lastname")
    private WebElement lastName;

    public void InputLastName (String textToSend) {
        lastName.sendKeys(textToSend);
    }
    @FindBy(how = How.ID, using = "input-payment-email")
    private WebElement email;

    public void InputEmail (String textToSend) {

        email.sendKeys(textToSend);
    }
    @FindBy(how = How.ID, using = "input-payment-telephone")
    private WebElement telephone;

    public void InputTelephone (String textToSend) {

        telephone.sendKeys(textToSend);
    }

    @FindBy(how = How.ID, using = "input-payment-address-1")
    private WebElement address;

    public void InputAddress (String textToSend) {

        address.sendKeys(textToSend);
    }

    @FindBy(how = How.NAME, using = "city")
    private WebElement city;

    public void SelectCity() {

        city.click();
    }

    Select index = new Select (city);

    public void selectCity(int i)
    {
        index.selectByIndex(i);
    }

    @FindBy(how = How.NAME, using = "postcode")
    private WebElement postcode;

    public void SelectPostcode() {

        postcode.click();
    }
    Select index1 = new Select (postcode);

    public void SelectPostcode1050(int i) {

        index.selectByIndex(i);
    }
    @FindBy(how = How.NAME, using = "country_id")
    private WebElement country;

    public void SelectCountry() {

        country.click();
    }
    Select index2 = new Select (country);

    public void SelectLatvia(String text) {
        index2.selectByVisibleText (text);
    }

    @FindBy(how = How.NAME, using = "zone_id")
    private WebElement zone;

    public void SelectZone() {
        zone.click();
    }
    Select index3 = new Select (zone);

    public void SelectRigaZone(String text) {
        index3.selectByVisibleText(text);
    }

    @FindBy(how = How.ID, using = "button-guest")
    private WebElement continueCheckout;

    public void ContinueCheckoutButton() {
        continueCheckout.click();
    }


}
