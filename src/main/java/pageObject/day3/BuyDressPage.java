package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyDressPage extends BaseFunc {
    public BuyDressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//p[@class='our_price_display']")

    private WebElement price;

    @FindBy(how = How.XPATH, using = "//button[@name='Submit']")
    private WebElement buy;

    public String getPrice() {
        waitElementAppeared(price);

        return price.getText();
    }

    public void addToCard() {
        buy.click();
    }
}
