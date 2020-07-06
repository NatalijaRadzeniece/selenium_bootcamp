package pageObject.day2HomeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YSMonitorsPage extends BaseFunc {

    public YSMonitorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (how = How.CSS, using = "[onclick=\"cart.add('42', '2');\"]")
    public WebElement addToCartButton;

    public void clickAddToCartButton(){
        addToCartButton.click();
    }
}
