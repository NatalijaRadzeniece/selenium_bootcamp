package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


// This is Parent PageObject class should contains common methods which will be used for many PageObjects to prevent code duplication.
public class BaseFunc {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Alert alert;
    protected Select select;

    public BaseFunc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 70);
    }

    public void acceptAlert() {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void setTextAlert() {
        alert = driver.switchTo().alert();
        alert.sendKeys("Meow");
    }

    public void selectByVisibleText(WebElement element, String optionName){
        select = new Select(element);
        select.selectByVisibleText(optionName);

    }

    public void waitForElementToBeClickable(WebElement element, String expectedText){
        wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }

    public void waitElementAppeared(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
