package pageObject.day2.PROJECT;

import core.BaseFunc;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NinjaCheckoutPage extends BaseFunc {


    public NinjaCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[value=\"guest\"]")
    private WebElement guestCheckout;
    @FindBy(how = How.CSS, using = ".col-sm-6 [ value=\"Continue\"]")
    private WebElement customerContinue;
    @FindBy(how = How.CSS, using = "input[name=\"firstname\"]")
    private WebElement firstName;
    @FindBy(how = How.CSS, using = "input[name=\"lastname\"]")
    private WebElement lastName;
    @FindBy(how = How.CSS, using = "input[id=\"input-payment-email\"]")
    private WebElement eMail;
    @FindBy(how = How.CSS, using = "input[id=\"input-payment-telephone\"]")
    private WebElement telephone;
    @FindBy(how = How.CSS, using = "input[name=\"address_1\"]")
    private WebElement addressOne;
    @FindBy(how = How.CSS, using = "[name=\"city\"]")
    private WebElement city;
    @FindBy(how = How.CSS, using = "[name=\"postcode\"]")
    private WebElement postCode;
    @FindBy(how = How.CSS, using = "[name=\"country_id\"]")
    private WebElement selectOption2;
    @FindBy(how = How.CSS, using = "[name=\"zone_id\"]")
    private WebElement select;
    @FindBy(how = How.CSS, using = "#input-payment-zone option[value=\"4133\"]")
    private WebElement selectOption;
    @FindBy(how = How.CSS, using = "#collapse-payment-address input#button-guest")
    private WebElement continueButton;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address input[name=\"firstname\"]")
    private WebElement firstName2;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address input[name=\"lastname\"]")
    private WebElement lastName2;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address input[name=\"address_1\"]")
    private WebElement address2;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address input[name=\"city\"]")
    private WebElement city2;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address input[name=\"postcode\"]")
    private WebElement postCode2;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address select[name=\"country_id\"]")
    private WebElement selectOption22;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address [name=\"zone_id\"]")
    private WebElement select3;
    @FindBy(how = How.CSS, using = "#input-shipping-zone option[value=\"4134\"]")
    private WebElement selectOption3;
    @FindBy(how = How.CSS, using = "#collapse-payment-address [name=\"shipping_address\"]")
    private WebElement billingaddress;
    @FindBy(how = How.CSS, using = "#collapse-shipping-address [id=\"button-guest-shipping\"]")
    private WebElement continueButton2;
    @FindBy(how = How.CSS, using = ".panel-body textarea[name=\"comment\"]")
    private WebElement Comments;
    @FindBy(how = How.CSS, using = "[id=\"button-shipping-method\"]")
    private WebElement continueButton3;
    @FindBy(how = How.CSS, using = "#collapse-payment-method input[type=\"checkbox\"]")
    private WebElement termsConditions;
    @FindBy(how = How.CSS, using = "input[id=\"button-payment-method\"]")
    private WebElement continueButton4;
    @FindBy(how = How.CSS, using = "input[value=\"Confirm Order\"]")
    private WebElement confirmButton;

    public void clickGuestCheckout() {
        waitElementAppeared(guestCheckout);
        guestCheckout.click(); }

    public void clickOnContinue() {
        customerContinue.click();
    }


    public void writeName() {
        waitElementAppeared(firstName);
        firstName.sendKeys("John"); }


    public void writeLastName() {
        lastName.sendKeys("Sample");
    }


    public void writeEmail() {
        eMail.sendKeys("John.Sample@gmail.com");
    }


    public void writeTelephone() {
        telephone.sendKeys("2228888");
    }

    public void writeAddressOne() {
        addressOne.sendKeys("Address101");
    }

    public void writeCity() {
        city.sendKeys("Wonderland");
    }

    public void writePostCode() {
        postCode.sendKeys("LV-1011");
    }


    public void selectCountry() {
        Select country = new Select(selectOption2);
        country.selectByValue("117"); }

    public void selectRegion() {
        waitElementAppeared(selectOption);
        Select region = new Select(select);
        region.selectByValue("4133"); }

    public void clickContinue() {
        continueButton.click(); }

    public void writeFirstName2() {
        waitElementAppeared(firstName2);
        firstName2.sendKeys("John"); }

    public void writeLastName2() {
        lastName2.sendKeys("Sample");
    }

    public void writeAddress2() {
        address2.sendKeys("Address101");
    }

    public void writeCity2() {
        city2.sendKeys("Wonderland");
    }

    public void writePostCode2() {
        postCode2.sendKeys("LV-1011");
    }

    public void selectCountry2() {
        waitElementAppeared(selectOption22);
        Select country = new Select(selectOption22);
        country.selectByValue("117"); }

    public void selectRegion2() {
        waitElementAppeared(selectOption3);
        Select region = new Select(select3);
        region.selectByValue("4134"); }

    public void clickOnBillingCheckBox() {
        billingaddress.click();
    }

    public void clickContinue2() {
        continueButton2.click();
    }


    public void writeComments() {
        waitElementAppeared(Comments);
        Comments.sendKeys("Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo."); }


    public void clickContinue3() {
        waitElementAppeared(continueButton3);
        continueButton3.click(); }


    public void clickOnTermsCheckBox() {
        waitElementAppeared(termsConditions);
        termsConditions.click(); }


    public void clickContinue4() {
        waitElementAppeared(continueButton4);
        continueButton4.click(); }

    public void clickOnConfirmButton() {
        waitElementAppeared(confirmButton);
        confirmButton.click(); }

}