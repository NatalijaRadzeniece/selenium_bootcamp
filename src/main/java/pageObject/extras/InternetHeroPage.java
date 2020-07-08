package pageObject.extras;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InternetHeroPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Hovers')]")
    private WebElement hovers;

    @FindBy(how = How.XPATH, using = "//a[text()='Dynamic Controls']")
    private WebElement dynamicControls;

    @FindBy(how = How.XPATH, using = "//a[text()='Key Presses']")
    private WebElement keyPresses;

    public InternetHeroPage(WebDriver driver) {
        super(driver);
    }

    public void clickHovers() {
        hovers.click();
    }

    public void clickDynamicControls(){
        dynamicControls.click();
    }

    public void clickKeyPresses(){
        keyPresses.click();
    }
}
