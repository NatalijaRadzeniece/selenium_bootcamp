package pageObject.homeworkMonitor;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuccessPage extends BaseFunc {

    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h1[.=('Your order has been placed!')]")
    private WebElement orderSuccessfulMessage;

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cartItemsTotal;

    public String verifyOrderSuccessful() {
        waitElementAppeared(orderSuccessfulMessage);
        return orderSuccessfulMessage.getText();
    }

    public String verifyEmptyCart() {
        return cartItemsTotal.getText();
    }
}
