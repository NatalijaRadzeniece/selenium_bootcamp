package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TutorialsNinjaProductPage extends BaseFunc{
    public TutorialsNinjaProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//img[contains(@title, 'Apple Cinema 30')]/../../..//span[text()='Add to Cart']")
    private WebElement appleMonitor;
    @FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='6']")
    private WebElement radioMedium;
    @FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @value='10']")
    private WebElement checkbox3;
    @FindBy(how = How.XPATH, using = "//input[@name='option[208]']")
    private WebElement textField;
    @FindBy(how = How.ID, using = "input-option217")
    private WebElement selectDropdown;
    @FindBy(how = How.XPATH, using = "//textarea[@name='option[209]']")
    private WebElement textAreaField;
    @FindBy(how = How.NAME, using = "option[219]")
    private WebElement dateField;
    @FindBy(how = How.NAME, using = "option[221]")
    private WebElement timField;
    @FindBy(how = How.NAME, using = "option[220]")
    private WebElement dateAndTimeField;
    @FindBy(how = How.ID, using = "input-quantity")
    private WebElement quantityField;
    @FindBy(how = How.ID, using = "button-cart")
    private WebElement addToCartButton;

    public void selectAppleMonitor() {
        appleMonitor.click();
        radioMedium.click();
    }

    public void orderAppleMonitor(String textValue, String selectValue, String textAreaValue, String date, String time, String dateAndTime, String quantity) {
        checkbox3.click();
        typeText(textField, textValue);

        Select slc = new Select(selectDropdown);
        slc.selectByVisibleText(selectValue);

        typeText(textAreaField, textAreaValue);
        uploadFakeFile();
        typeText(dateField, date);
        typeText(timField,time);
        typeText(dateAndTimeField, dateAndTime);
        typeText(quantityField, quantity);
        addToCartButton.click();
    }

    private void uploadFakeFile() {
        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('input-option222').setAttribute('value', 'testPicture.png')");
    }

    private void typeText(WebElement elem, String inputText) {
        elem.clear();
        elem.sendKeys(inputText);
    }
}
