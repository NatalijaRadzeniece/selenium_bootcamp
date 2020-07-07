package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TutorialsHomePage extends BaseFunc {

    public TutorialsHomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Components")
    private WebElement components;

    public void ClickComponents() {
        components.click();
    }


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Monitors')]")
    private WebElement monitors;

    public void ClickMonitors() {

        monitors.click();
    }

}


