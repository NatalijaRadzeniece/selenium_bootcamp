package pageObject.extras;

import core.BaseFunc;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.html.HTMLObjectElement;

public class DynamicControlsPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//div[@id='checkbox']")
    private WebElement checkbox;

    @FindBy(how = How.XPATH, using = "//button[text()='Remove']")
    private WebElement removeButton;

    @FindBy(how = How.XPATH, using = "//p[@id='message']")
    private WebElement message;

    @FindBy(how = How.XPATH, using = "//button[text()='Enable']")
    private WebElement enableButton;

    @FindBy(how = How.XPATH, using = "//input[@type='text']")
    private WebElement textInputField;

    @FindBy(how = How.XPATH, using = "//button[text()='Disable']")
    private WebElement disableButton;

    @FindBy(how = How.XPATH, using = "//input[@disabled]")
    private WebElement disabledtextField;

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void markCheckbox() {
        checkbox.click();
    }

    public void clickRemove() {
        removeButton.click();
    }

    public String verifyDestroy() {
        waitElementAppeared(message);
        return message.getText();
    }

    public void clickEnableButton() {
        enableButton.click();
    }

    public void writeInBox(String text1) {
        waitForTheElementToBeClickable2(textInputField);
        textInputField.sendKeys(text1);
    }

    public void clickDisableButton() {
        disableButton.click();
    }

    public void verifyTextFieldIsDisabled() {
        waitForTheElement(enableButton);
        Boolean actual = textInputField.isEnabled();
        if (actual)
            System.out.println("Enabled");
        else
            System.out.println("Disabled");
    }

    public void verifyTextFieldIsDisabledTwo() {
        textInputField.getAttribute("disabled");
        System.out.println("Disabled attribute located");
    }

}


