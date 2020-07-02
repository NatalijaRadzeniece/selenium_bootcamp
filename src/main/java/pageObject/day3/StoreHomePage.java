package pageObject.day3;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreHomePage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(StoreHomePage.class);

    public StoreHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement buttonWomen;

    public void clickOnButtonWomen() {
        LOGGER.info("Load woman page");
        buttonWomen.click();
    }
}
