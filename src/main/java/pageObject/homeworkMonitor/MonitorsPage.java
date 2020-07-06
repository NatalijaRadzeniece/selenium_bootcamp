package pageObject.homeworkMonitor;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonitorsPage extends BaseFunc {

    public MonitorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[contains(@onclick,'42')]//i[@class='fa fa-shopping-cart']")
    public WebElement addToCart;

    public void clickAddToCart() {
        addToCart.click();
    }
}
