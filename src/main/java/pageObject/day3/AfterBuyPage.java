package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AfterBuyPage extends BaseFunc {
    public AfterBuyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[@title='Continue shopping']")
    private WebElement continueBtn;

    @FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
    private WebElement checkout;

    public void pressContinueBtn() {
        waitElementAppeared(continueBtn);
        continueBtn.click();
    }

    public void pressCheckout() {
        waitElementAppeared(checkout);

        checkout.click();
    }
}
