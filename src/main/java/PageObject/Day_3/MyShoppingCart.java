package PageObject.Day_3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyShoppingCart extends BaseFunc {
    public MyShoppingCart(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='View my shopping cart']")
    private WebElement shoppingCartView;

    public void ClickToShoppingCart() {
        shoppingCartView.click();

    }
}