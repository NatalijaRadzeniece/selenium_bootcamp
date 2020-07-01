package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chapter1Page extends BaseFunc {

    public Chapter1Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "belowcenter")
    public WebElement textBox;

    @FindBy(how = How.CLASS_NAME, using = "multiplewindow")
    public WebElement clickLinkLaunch;

    @FindBy(how = How.ID, using = "divinthecenter")
    public WebElement verifyButton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    public WebElement beginnersGuide;

    @FindBy(how = How.CSS, using ="[id='selecttype']")
    private WebElement selectTypeDD;

    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public String getTextOfTextBox(){
        return textBox.getText();
    }

    public void getClickLinkLaunchlinText(){
        String text = clickLinkLaunch.getText();
        System.out.println(text);
    }

    public void printButtonVerifyAttribute() {
        System.out.println(verifyButton.getAttribute("size"));
    }

    public void printBeginnersGuidecssValuePrint() {
        System.out.println(beginnersGuide.getCssValue("color"));
    }
    public void selectFromSelectTypeDD(String optionName) {
        selectByVisibleText(selectTypeDD, optionName);
    }

    }