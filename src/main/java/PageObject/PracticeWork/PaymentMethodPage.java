package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentMethodPage extends BaseFunc {
    public PaymentMethodPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(how = How.NAME, using = "agree")
    private WebElement agree;

    public void ClickAgree() {

        agree.click();
    }
    @FindBy(how = How.ID, using = "button-payment-method")
    private WebElement checkout3;

    public void ClickCheckout3() {

        checkout3.click();
    }
}
