package classTests.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ExplicitWaitSample  {

    //Should be at "BaseWebTest" or "BaseFunc" classes

    @FindBy(how= How.ID, using = "element")
    private WebElement webElement;

    @FindBy(how= How.ID, using = "element")
    private List<WebElement> listOfElements;

    // Initializing wait, adding driver and also time in seconds
    WebDriverWait wait = new WebDriverWait(driver,50); //usuallu10-0 sec wait, not 50

    //Until clickable -wait until the element is clickable by the locator or by WebElement.
    public void waitUntilClickableLocator(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("locator")));
    }
    public void waitUntilClickableWebElement(){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    //check if the element is present on the DOM of a page and visible.
    //also can be done by locator or webElement
    public void waitUntilOfVisibility(){
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    //check all elements present on the web page are visible. We need to pass list of WebElements.
    public void waitUntilVisabilyOfAllElements(){
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfElements));
    }

    // used for checking that an element is either invisible or not present on the DOM
    //same can be done for list, but use .invisibilityOfAllElements
    public void waitUntilInvisibilityOFElement(){
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    //waits until checkbox or radio button will be marked. Can be used webElement or locator.
    public void waitUntilElementToBeSelected(){
        wait.until(ExpectedConditions.elementToBeSelected(webElement));
    }

    // Conditions for explicit wait way more than listed here. Full list you will see after you will put dot after "ExpectedConditions."
}
