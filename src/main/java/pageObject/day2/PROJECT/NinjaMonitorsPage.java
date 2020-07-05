package pageObject.day2.PROJECT;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NinjaMonitorsPage extends BaseFunc {
    public NinjaMonitorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[onclick=\"cart.add('42', '2');\"]")
    private WebElement addToCart;

    public void clickOnAddToCart() {
        addToCart.click();
    }

}
