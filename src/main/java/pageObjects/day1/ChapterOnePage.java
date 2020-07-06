package pageObjects.day1;

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
    //day2
    @FindBy(how = How.CSS, using = "[id='selecttype']")
    private WebElement selectTypeDD;
//day2 end

    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    //day2 select from DD
    public String getTextOfTextBox() {
        return textBox.getText();
    }

    //day2 end

    public String getTextOfWindowLink() {
        String text = windowLink.getText();
        return text;
    }


    public void printAttributeVerifyButton() {
        System.out.println(verifyButton.getAttribute("value"));
    }

    public String printCssValueguide() {
//        System.out.println(beginnersGuide.getCssValue("color"));
        return beginnersGuide.getCssValue("color");
    }

    //day2 select from DD
    public void selectFromSelectTypeDD(String optionName) {
        selectByVisibletext(selectTypeDD, optionName);
        //day2 end
    }
}