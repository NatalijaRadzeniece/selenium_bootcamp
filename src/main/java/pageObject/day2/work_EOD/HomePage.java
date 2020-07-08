package pageObject.day2.work_EOD;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseFunc {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using ="//a[contains(text(), 'Components')]")
    public WebElement componentMenu;

    @FindBy(how = How.XPATH, using ="//a[contains(text(), 'Monitors')]")
    public WebElement monitorDrop;

    public void clickComponentMenu(){
        componentMenu.click();
    }

    public void clickMonitorDrop(){
        monitorDrop.click();
    }
}
