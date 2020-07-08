package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ItemSizePage extends BaseFunc {
    public ItemSizePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//select[@name='group_1']")
    private WebElement mySize;

    @FindBy(how = How.ID, using = "add_to_cart")
    private WebElement addToCart;

    @FindBy(how = How.CLASS_NAME, using = "continue btn btn-default button exclusive-medium")
    private WebElement continueShopping;

    public void selectSize(String size) {
        waitForTheElement(mySize);
        Select select = new Select(mySize);
        select.selectByValue(size);
    }

    public void clickAddToCart() {
        waitForTheElement(addToCart);
        addToCart.click();
    }

    public void clickContinueShopping() {
        waitForTheElement(continueShopping);
        continueShopping.click();
    }


}
