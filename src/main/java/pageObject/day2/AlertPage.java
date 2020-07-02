package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertPage extends BaseFunc {
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.CSS, using = "[onclick='jsAlert()']")
    private WebElement simpleAlert;

    @FindBy(how = How.CSS, using = "[onclick='jsConfirm()']")
    private WebElement confirmAlert;

    @FindBy(how = How.CSS, using = "[onclick='jsPrompt()']")
    private WebElement promtAlert;

    public void clickSimpleAlert(){
        simpleAlert.click();
    }

    public void clickConfirmAlert() {
        confirmAlert.click();
    }

    public void clickPromptAlert() {
        promtAlert.click();
    }


}
