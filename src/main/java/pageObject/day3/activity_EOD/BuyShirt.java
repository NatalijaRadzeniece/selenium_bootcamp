package pageObject.day3.activity_EOD;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyShirt extends BaseFunc {

    public BuyShirt(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//p[@class='our_price_display']")
    private WebElement priceShirt;

    @FindBy(how = How.XPATH, using = "//button[@name='Submit']")
    private WebElement clickBuyShirt;

    //I dont know how to select those 2 buttons..It is stopping on that.

    public String getPrice() {
        return priceShirt.getText();
    }

    public void addToCard() {
        clickBuyShirt.click();
    }





}
