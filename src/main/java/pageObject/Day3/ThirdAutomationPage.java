package pageObject.Day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ThirdAutomationPage extends BaseFunc {
    public ThirdAutomationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = ".//*[text()='Add to cart']")
    private WebElement shirtAddToCartAllert;
////span[contains(text(), 'Add to cart')]////button[@name='Submit']
    @FindBy(how = How.XPATH, using = ".//span[contains(@title,'Continue shopping')]")
    private WebElement shirtContinue;

    public void clickOnShirtAddToCartAllert() {
        waitElementAppeared(shirtAddToCartAllert);
        shirtAddToCartAllert.click();
    }
    public void clickOnShirtContinue() {
        //waitElementAppeared(shirtContinue);
        shirtContinue.click();
    }

}