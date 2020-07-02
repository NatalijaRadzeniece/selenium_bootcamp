package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WomanPage extends BaseFunc {

    public WomanPage(WebDriver driver) {
        super(driver);}
    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    public WebElement womenButton;

    @FindBy(how = How.CLASS_NAME, using = "shopping_cart")
    public WebElement shoppingCart;

    public void clickWomenButton(){womenButton.click();}

    public void clickShoppingCart(){shoppingCart.click();}

}
