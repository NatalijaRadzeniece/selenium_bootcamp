package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmPage extends BaseFunc {
    public ConfirmPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//h1[contains (text(),'Your order has been placed')]")
    private WebElement orderMessage;

    public String GetMessageFromPage() {
        String text1 = orderMessage.getText();
        return text1;
    }
    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cartEmpty;

    public void ClickCart(){
        cartEmpty.click();
    }

    @FindBy(how = How.XPATH, using = "//p[contains (text(),'Your shopping cart is empty!')]")
    private WebElement cartMessage;

    public String getMessageFromCart() {
    String text = cartMessage.getText();
        return text;
    }

}
