package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StorePageOne extends BaseFunc {

    public StorePageOne(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.CSS, using = "a[title='Women']")
    private WebElement sectionWomen;

    public void clickOnsectionWomen(){
        sectionWomen.click();
    }

}
