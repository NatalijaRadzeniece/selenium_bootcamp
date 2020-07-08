package pageObject.day2.work_EOD;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonitorPage extends BaseFunc {

    public MonitorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (how = How.CSS, using = "[onclick=\"cart.add('42', '2');\"]")
    public WebElement addCart;

    public void clickAddCart(){
        addCart.click();
    }

}
