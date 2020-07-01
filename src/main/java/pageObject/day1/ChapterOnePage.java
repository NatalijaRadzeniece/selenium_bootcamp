package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {
    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.ID, using = "multiplewindow")
    private WebElement windowLink;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifyButton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement beginnersGuide;

    @FindBy(how = How.CSS, using = "[id='selecttype']")
    private WebElement selectTypeDD;

public void setTextBox(String textToSend){
    textBox.clear();
    textBox.sendKeys(textToSend);
}

public String getTextOfTextBox(){
    return textBox.getText();
}

public String getTextOfWindowLink(){
    String text = windowLink.getText();
    return text;
}
    public void printAttributeVerifyButton(){
    System.out.println(verifyButton.getAttribute("value"));
    }
    public String printCssValueguide() {
        return beginnersGuide.getCssValue("color");
    }

    public void selectFromSelectTypeDD(String optionName){
    selectByVisibleText(selectTypeDD, optionName);
    }
}