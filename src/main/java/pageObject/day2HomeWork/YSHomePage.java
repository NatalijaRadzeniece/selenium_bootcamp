package pageObject.day2HomeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YSHomePage extends BaseFunc {

    public YSHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Components')]")
    public WebElement componentsMenu;

    public void clickComponentsMenu() {
        componentsMenu.click();
    }
}
