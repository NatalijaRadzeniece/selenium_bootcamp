package pageObject.extras;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class KeyPressesPage extends BaseFunc {

    @FindBy(how = How.ID, using = "target")
    private WebElement inputField;

    @FindBy(how = How.XPATH, using = "//form")
    private WebElement verifyMessage;

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void enterInputField(){
        inputField.sendKeys(Keys.ENTER);
    }
    public String keyPressed(){
        return verifyMessage.getText();
    }

    public void tabInputField(){
        inputField.sendKeys(Keys.TAB);
    }

    public void upInputField(){
        inputField.sendKeys(Keys.UP);
    }

    public void downInputField(){
        inputField.sendKeys(Keys.DOWN);
    }

}
