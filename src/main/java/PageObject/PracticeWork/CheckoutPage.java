package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage extends BaseFunc {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//input [contains (text(), 'Guest Checkout')]")
    private WebElement guest;

    public void SelectGuestCheckout() {
        guest.click();
    }
    @FindBy(how = How.XPATH, using = "//input [@value= 'Continue']")
    private WebElement guestContinue;

    public void ClickGuestContinue() {

        guestContinue.click();
    }
}
