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
    private WebElement jsAlert;

    @FindBy(how = How.CSS, using = "[onclick='jsConfirm()']")
    private WebElement jsConfirm;

    @FindBy(how = How.CSS, using = "[onclick='jsPrompt()']")
    private WebElement jsPrompt;

    public void clickJsAlertButton() {
        jsAlert.click();
    }

    public void clickJsConfirmButton() {
        jsConfirm.click();
    }

    public void clickJsPromptButton() {
        jsPrompt.click();
    }
}
