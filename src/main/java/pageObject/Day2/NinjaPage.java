package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class NinjaPage extends BaseFunc {
    public NinjaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[contains(@onclick, 'cart')]")
    private List<WebElement> addButtonTv;

    public void clickButtonFromList(int i) {
        WebElement buttonTV = addButtonTv.get(i);
        buttonTV.click();
    }

    @FindBy(how = How.XPATH, using = "//input[contains(@name, 'option[218]')]")
    private List<WebElement> radioButtons;

    public void clickRadioButton(int i) {
        WebElement radioButton = radioButtons.get(i);
        radioButton.click();
    }



}
