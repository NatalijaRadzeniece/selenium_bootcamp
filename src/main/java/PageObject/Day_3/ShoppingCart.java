package PageObject.Day_3;

import core.BaseFunc;
import model.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ShoppingCart extends BaseFunc {
    public ShoppingCart(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement continueShopping;

        public void ClickGoToShopping () {
            continueShopping.click();
        }


    }

