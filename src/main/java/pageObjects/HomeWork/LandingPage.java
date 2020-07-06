package pageObjects.HomeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage extends BaseFunc {
    public LandingPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Components')]")
    private WebElement componentsBtn;

    public void clickOnBtnComponents() {
        componentsBtn.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Monitors')]")
    private WebElement monitorsBtn;

    public void clickOnBtnMonitors() {
        monitorsBtn.click();
    }

    @FindBy(how = How.XPATH, using = "//button[@onclick=\"cart.add('42', '2');\"]")
    private WebElement addCartBtn;
    public void clickBtnAddCart(){
        addCartBtn.click();
    }

}
