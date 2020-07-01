package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ninjaPage extends BaseFunc {
    public ninjaPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'pale-sky py-3 px-2')]")
    private List<WebElement> menuItems;

}
