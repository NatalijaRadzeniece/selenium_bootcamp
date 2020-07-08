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

    @FindBy(how = How.CLASS_NAME, using = "multiplewindow")
    private WebElement textElement;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement getAttribute;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private  WebElement getCssValue;


    public void setTextBox(String textToSend){
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public void getTextOfWindowLink(){
        String text = textElement.getText();
        System.out.println(text);
    }

    public void getAttribute(){
        String value = getAttribute.getAttribute("value");
        System.out.println(value);
    }

    public void getCssValue(){
        String color = getCssValue.getCssValue("color");
        System.out.println(color);
    }
}