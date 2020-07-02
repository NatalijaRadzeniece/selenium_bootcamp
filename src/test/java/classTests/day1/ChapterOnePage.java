package classTests.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {
    public ChapterOnePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Chapter1")
    private WebElement chapter1Element;
    @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;
    @FindBy(how = How.ID, using = "multiplewindow")
    private WebElement link1;
    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifyButton;
    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement mainHeading;

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
        return link1.getText();
    }

    public void getAttributeOfButton(){
        String attribute1 = verifyButton.getAttribute("value");
        System.out.println(attribute1);

    }
    public String getColorOfHeading(){
        return mainHeading.getCssValue("color");

    }

    public  void selectFromSelectTypeDD(String optionName){
        selectByVisibleText(selectTypeDD, optionName );
    }


}
