package pageObject.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import core.BaseFunc;

public class ChapterOnePage extends BaseFunc {
    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }

   @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.ID, using = "...")
    private WebElement windowLink;

    @FindBy(how = How.ID, using = "...")
    private WebElement verifyButton;

    @FindBy(how = How.ID, using = "...")
    private WebElement beginnersGuide;

    @FindBy(how = How.CSS, using = "[id='selecttype']")
    private WebElement selectTypeDD;

    public void setTextBoxText(String textToSend)
    {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public String getTextOfWindowLink()    {
        return windowLink.getText();
    }

    public void printAttributeOfVerifyButton()
    {
        System.out.println(verifyButton.getAttribute("value"));
    }

    public void printCssValueOfBeginnersGuide()
    {
        System.out.println(beginnersGuide.getCssValue("color"));
    }
    public String getTextofTextBox() {
        return textBox.getText();
    }

    public void selectFromSelectTypeDD(String optionName){
        selectByVisibleText(selectTypeDD, optionName);
        }

}
