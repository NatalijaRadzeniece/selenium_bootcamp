package PageObject.Day_1;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {

    public ChapterOnePage(WebDriver driver) {
        super (driver);

    }

    @FindBy(how= How.ID, using="html5div")
    private WebElement textBox;

    @FindBy(how= How.ID, using="multiplewindow")
    private WebElement windowLink;

    @FindBy(how= How.ID, using="verifybutton")
    private WebElement verifyButton;

    @FindBy(how= How.CLASS_NAME, using="mainheading")
    private WebElement beginnersGuide;

    @FindBy (how=How.CSS,using= "[id='selecttype']")
    private WebElement selectTypeDD;

    public void setTextBox (String textToSend){
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

   public String getTextOfTextBox() {
       String text = textBox.getText();
       return text;
   }
    public String getTextOfTextWindowLink() {
        String text=windowLink.getText();
        return text;
    }

    public String printAttributeVerifyButton (){
        return verifyButton.getAttribute("value");

    }
    public String printCssValueGuide(){

        return beginnersGuide.getCssValue("color");
    }

    public void setSelectTypeDD(String optionName)
    {

        selectByVisibleText(selectTypeDD,optionName);
    }
}
