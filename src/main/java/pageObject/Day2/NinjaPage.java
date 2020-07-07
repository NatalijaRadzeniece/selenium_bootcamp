package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.util.List;

public class NinjaPage extends BaseFunc {

    public NinjaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h4/a[contains(@href, 'product_id=42')]")
    private WebElement appleTV;

    public String getTVname () {
        return appleTV.getText();
    }

    public void clickAddAppleTV() {
        appleTV.click();
    }

    @FindBy(how = How.XPATH, using = "//input[contains(@name, 'option[218]')]")
    private List<WebElement> radioButtons;

    public void clickRadioButton(int i) {
        waitUntilVisabilyOfAllElements(radioButtons);
        WebElement radioButton = radioButtons.get(i);
        radioButton.click();
    }

    @FindBy(how = How.XPATH, using = "//input[contains(@name, 'option[223][]')]")
    private List<WebElement> checkBox;

    public void clickCheckBox(int i) {

        WebElement checkBoxSelect = checkBox.get(i);
        checkBoxSelect.click();
    }

    @FindBy(how = How.NAME, using = "option[208]")
    private WebElement textBox;

    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    @FindBy(how = How.NAME, using = "option[217]")
    private WebElement selectColor;

    public void selectFromSelectColor(String optionName) {
        selectByVisibleText(selectColor, optionName);
    }

    @FindBy(how = How.NAME, using = "option[209]")
    private WebElement textBoxSecond;

    public void setTextBoxSecond(String textToSendSecond) {
        textBoxSecond.clear();
        textBoxSecond.sendKeys(textToSendSecond);
    }

    @FindBy(how = How.ID, using = "input-option222")
    private WebElement fileInput;

    @FindBy(how = How.ID, using = "button-upload222")
    private WebElement fileUpload;

    public void setFile() throws InterruptedException{
        String path = System.getProperty("user.dir") + "\\src\\resources\\butterfly.jpg";
        String jse = "arguments[0].value='butterfly.jpg'";
        ((JavascriptExecutor)driver).executeScript(jse, fileInput);
        fileUpload.sendKeys(path);
    }

    @FindBy(how = How.NAME, using = "option[219]")
    private WebElement dateBox;

    public void setDateBox(String dateToDateBox) {
        dateBox.clear();
        dateBox.sendKeys(dateToDateBox);
    }

    @FindBy(how = How.NAME, using = "option[221]")
    private WebElement timeBox;

    public void setTimeBox(String timeToTimeBox) {
        timeBox.clear();
        timeBox.sendKeys(timeToTimeBox);
    }

    @FindBy(how = How.NAME, using = "option[220]")
    private WebElement dateAndTimeBox;

    public void setDateAndTimeBox(String dateAndTimeToBox) {
        dateAndTimeBox.clear();
        dateAndTimeBox.sendKeys(dateAndTimeToBox);
    }

    @FindBy(how = How.ID, using = "input-quantity")
    private WebElement inputQuantity;

    public void setInputQuantity(String quantityToPut) {
        inputQuantity.clear();
        inputQuantity.sendKeys(quantityToPut);
    }

    @FindBy(how = How.ID, using = "button-cart")
    private WebElement buttonAddCart;

    public void clickButtonAddCart() {
        buttonAddCart.click();
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Checkout']")
    private WebElement buttonCheckout;

    public void clickButtonCheckout() {
        buttonCheckout.click();
    }
}
