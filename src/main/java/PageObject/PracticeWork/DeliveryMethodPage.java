package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeliveryMethodPage extends BaseFunc {
    public DeliveryMethodPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(how = How.ID, using = "button-shipping-method")
    private WebElement continueCheckout;

    public void ClickContinueCheckout() {
        continueCheckout.click();
    }
}
