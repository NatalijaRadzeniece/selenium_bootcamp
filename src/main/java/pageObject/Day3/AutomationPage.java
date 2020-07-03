package pageObject.Day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AutomationPage extends BaseFunc {
    public AutomationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement buttonWomen;

    public void clickOnButtonWomen(){
        buttonWomen.click();
    }

}