package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


// This is Parent PageObject class should contains common methods which will be used for many PageObjects to prevent code duplication.
public class BaseFunc {

    private WebDriver driver;
    //day2 start
    private WebDriverWait wait;
    private Alert alert;
    private Select select;
    //day2  end
    public BaseFunc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);
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
//day2 stuff
    public void selectByVisibletext(WebElement element, String optionName){
        select = new Select(element);
        select.selectByVisibleText(optionName);
    }

    public void waitForTheListOfElements(List<WebElement> lists){
        wait.until(ExpectedConditions.visibilityOfAllElements(lists));
    }
    public void waitForTheWebElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    // cant read file on input field
//    public void waitForElementToBeClickable(WebElement element, String expectedText){
//        wait.until(ExpectedConditions.textToBePresentInElement(element,expectedText));
//    }
}
