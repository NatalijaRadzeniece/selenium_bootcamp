package PageObject.Day_2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertPage extends BaseFunc {
    
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (how = How.XPATH,using="//button[@ onclick='jsAlert()']")
    private WebElement simpleAlert;

    @FindBy (how = How.XPATH,using="//button[@ onclick='jsConfirm()']")
    private WebElement simpleAlert1;

    @FindBy (how = How.XPATH,using="//button[@ onclick='jsPrompt()']")
    private WebElement simpleAlert2;



    public void clickOnSimpleAlertButton() {
    simpleAlert.click();
    }

    public void clickOnAlertButton1(){
        simpleAlert1.click();
        }

        public void clickOnAlertButton2(){
        simpleAlert2.click();
        }
}
