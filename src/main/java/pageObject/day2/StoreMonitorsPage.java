package pageObject.day2;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreMonitorsPage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(StoreMonitorsPage.class);
    public StoreMonitorsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")
    private WebElement addCart;


    public void clickOnaddCart(){
        waitElementAppeared(addCart);
        addCart.click();

    }

}
