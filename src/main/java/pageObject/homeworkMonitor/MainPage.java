package pageObject.homeworkMonitor;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BaseFunc {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "a[href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25'].dropdown-toggle")
    public WebElement componentsDropDown;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Monitors')]")
    public WebElement monitorsButton;

    public void clickComponentsDropDown() {
        componentsDropDown.click();
    }

    public void clickMonitorsButton() {
        monitorsButton.click();
    }

}
