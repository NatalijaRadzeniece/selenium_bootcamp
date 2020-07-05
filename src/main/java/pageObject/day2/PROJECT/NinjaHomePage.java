package pageObject.day2.PROJECT;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NinjaHomePage extends BaseFunc {
    public NinjaHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "a[href=\"http://tutorialsninja.com/demo/index.php?route=product/category&path=25\"].dropdown-toggle")
    private WebElement sectionComponents;

    public void clickOnSectionComponents() {
        sectionComponents.click();
    }

    @FindBy(how = How.CSS, using = ".dropdown-menu a[href=\"http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28\"]")
    private WebElement sectionMonitors;

    public void clickOnSectionMonitors() {
        sectionMonitors.click();
    }

}
