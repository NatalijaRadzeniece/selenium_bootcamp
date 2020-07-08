package pageObject.day3.activity_EOD;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseFunc {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement clickWomen;

    public void clickingOnWoman(){
        clickWomen.click();
    }

}
