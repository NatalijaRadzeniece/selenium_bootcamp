package pageObject.day1;

import core.BaseFunc;
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

    @FindBy(how = How.CSS, using = "[id='selecttype']")
    private WebElement selectTypeDD;


    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public String getTextOfTextBox() {
        String text = textBox.getText();
        return text;
    }

    public String getTextOfWindowLink() {
        String text = windowlink.getText();
        return text;
    }

    public void getAttributeVerifyButton() {
        String value = verifybutton.getAttribute("value");
        System.out.println(value);
    }

    public String printCssValueguide() {
        return mainheading.getCssValue("Color");
    }

    public void selectFromSelectTypeDD(String optionName) {
        selectByVisibleText(selectTypeDD, optionName);
    }
}
