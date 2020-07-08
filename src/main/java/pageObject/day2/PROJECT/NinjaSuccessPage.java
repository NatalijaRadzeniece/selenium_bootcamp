package pageObject.day2.PROJECT;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NinjaSuccessPage extends BaseFunc {

    public NinjaSuccessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h1[contains(text(), 'Your order has been placed!')]")
    public WebElement successMessage;

    public boolean isSuccessMessageShown() {
        boolean successMessageShown = false;
        waitElementAppeared(successMessage);
        if(successMessage.isDisplayed()) {
            successMessageShown = true;
        }
        return successMessageShown;
    }

    @FindBy(how = How.CSS, using = "#cart .dropdown-toggle")
    private WebElement cartButton;

    public void clickCartButton() {
        cartButton.click();
    }

    @FindBy(how = How.XPATH, using = "//div[@id='cart']//p[contains(text(), 'Your shopping cart is empty!')]")
    private WebElement emptyCartMessage;

    public boolean isEmptyCartMessageShown() {
        boolean emptyCartMessageShown = false;
        waitElementAppeared(emptyCartMessage);
        if(emptyCartMessage.isDisplayed()) {
            emptyCartMessageShown = true;
        }
        return emptyCartMessageShown;
    }

}