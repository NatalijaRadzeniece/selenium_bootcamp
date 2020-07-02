package samplesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample2webElementActions {
    // Methods, action, locators and webElements alsways should be at page Object classes

    // Element - click on it
    WebElement elementClick = driver.findElement(By.id("id"));
    elementClick.click();

    //Element - send text to input field
    WebElement elementInput = driver.findElement(By.name("name"));
    elementInput.sendKeys("text to be send");

    //  Element - clear input field
    WebElement elementClear = driver.findElement(By.cssSelector("input[type='name']"));
    elementClear.clear();

    //Element - get text from element
    WebElement elementText = driver.findElement(By.id("id"));
    //to set text to variable we need to use "String"
    String textFromElement = elementText.getText();

    //Element - get attribute value
    WebElement elementAttribute = driver.findElement(By.id("id"));
    String attributeText = elementAttribute.getAttribute("attribute name");

    //Element - get css text
    WebElement elementCss = driver.findElement(By.id("id"));
    String cssText = elementCss.getCssValue("css value");

}
