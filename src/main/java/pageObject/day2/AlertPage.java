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
    private WebElement promptAlert;

    public void clickOnSimpleAlertButton() {
        simpleAlert.click();
    }

    public void clickOnConfirmationAlertButton() {
        simpleAlert.click();
    }

    public void clickOnPromptAlertButton() {
        simpleAlert.click();
    }
}
