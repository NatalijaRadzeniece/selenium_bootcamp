package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemSizePage extends BaseFunc {
    public ItemSizePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "form-control attribute_select no-print")
    private WebElement sizeSelector;

    @FindBy(how = How.XPATH, using = "//option[@title='M']")
    private WebElement mySize;

    @FindBy(how = How.XPATH, using = "//button[@name='Submit']")
    private WebElement addToCart;

    @FindBy(how = How.CLASS_NAME, using = "continue btn btn-default button exclusive-medium")
    private WebElement continueShopping;

    public void clickSizeSelector(){
        waitElementAppeared(sizeSelector);

        sizeSelector.click();}

    public void clickSelectedSize(){mySize.click();}

    public void clickAddToCart(){addToCart.click();}

    public void clickContinueShopping(){continueShopping.click();}



}
