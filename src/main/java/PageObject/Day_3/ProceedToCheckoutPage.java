package PageObject.Day_3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProceedToCheckoutPage extends BaseFunc {
    public ProceedToCheckoutPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(how = How.XPATH,using = "//span[@class ='cross')]")
        private WebElement proceedToCheckout;

        public void ClickProceedToCheckout (){
        proceedToCheckout.click();
        }

        }
