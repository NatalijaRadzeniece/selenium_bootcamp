package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chapter1 extends BaseFunc {

    public Chapter1(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.ID, using = "multiplewindow")
    private WebElement windowlink;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifybutton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement mainheading;

    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public void getTextOfWindowLink() {
        String text = windowlink.getText();
        System.out.println(text);
    }
    public void getAttributeverifybutton() {
        String value = verifybutton.getAttribute("value");
        System.out.println(value);
    }

    public void getCssValuemainheading(){
        String cssValue = mainheading.getCssValue("color");
        System.out.println(cssValue);
    }
}
