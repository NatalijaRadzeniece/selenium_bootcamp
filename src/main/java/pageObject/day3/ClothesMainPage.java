package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClothesMainPage extends BaseFunc {

    public ClothesMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement womenLink;

    public void clickOnWomen() {
        womenLink.click();
    }
}

