package pageObjects.HomeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPlacedPage extends BaseFunc {
    public OrderPlacedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h1[contains(text(), 'Your order has been placed!')]")
    private WebElement orderMsg;

    public String orderMsgText() {
        return orderMsg.getText();
    }

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cartInfo;

    public String cartInfoText() {
        return cartInfo.getText();
    }


}
