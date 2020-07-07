package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TutorialsNinjaPurchaseFinalPage extends BaseFunc {
    public TutorialsNinjaPurchaseFinalPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
    private WebElement successfulOrderContinueButton;
    @FindBy(how = How.XPATH, using = "//div[@id='content']/h1")
    private WebElement confirmationTitle;
    @FindBy(how = How.XPATH, using = "//div[@id='content']/p[1]")
    private WebElement confirmationDescription;

    public String getConfirmationTitle() {
        return confirmationTitle.getText();
    }

    public String getConfirmationMessage() {
        return confirmationDescription.getText();
    }

    public void finishPurchase() {
        successfulOrderContinueButton.click();
    }

    public void waitForPage() {
        waitElementAppeared(confirmationTitle);
    }
}



