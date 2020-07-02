package pageObject.day3;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SecondStorePage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(SecondStorePage.class);
    public SecondStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//img[@title='Faded Short Sleeve T-shirts']")
    private WebElement shirt;

    @FindBy(how = How.XPATH, using = "//img[@title='Blouse']")
    private WebElement blouse;

    public String clickOnBlouse() {
        waitElementAppeared(blouse);
        LOGGER.info("Click on blouse");
        blouse.click();
        return "Blouse";
    }

    public String clickOnShirt() {
        waitElementAppeared(shirt);
        LOGGER.info("Click on shirt");
        shirt.click();
        return "Faded Short Sleeve T-shirts";
    }
}
