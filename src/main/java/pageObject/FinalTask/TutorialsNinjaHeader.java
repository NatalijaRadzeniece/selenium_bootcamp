package pageObject.FinalTask;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TutorialsNinjaHeader extends BaseFunc {
    public TutorialsNinjaHeader(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25']")
    private WebElement components;
    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28']")
    private WebElement monitors;
    @FindBy(how = How.CSS, using = "[class='btn-group btn-block']")
    private WebElement cartFrame;
    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/checkout']/i[@class='fa fa-share']")
    private WebElement checkoutButton;
    @FindBy(how = How.XPATH, using = "//p[@class='text-center']")
    private WebElement cartFrameInfo;

    public void selectMonitors() {
        components.click();
        monitors.click();
    }

    public void checkOut(){
        cartFrame.click();
        checkoutButton.click();
    }

    public String getCartMessage() {
        return cartFrameInfo.getText();
    }
}