package PageObject.Day_3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationHomePage extends BaseFunc {
    public AutomationHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement womenButton;


    public void ClickWomenbutton() {
        womenButton.click();

    }

}








