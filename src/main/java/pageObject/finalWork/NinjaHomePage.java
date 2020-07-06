package pageObject.finalWork;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NinjaHomePage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(NinjaHomePage.class);

    public NinjaHomePage(WebDriver driver) {
        super(driver);
    }

//    WebElement element = driver.findElement(By.xpath()


    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
    private WebElement components;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Monitors (2)')]")
    private WebElement monitors;

    public void clickOnComponents(){
        components.click();

    }

    public void clickOnMonitors(){
        LOGGER.info("Load monitor page");
        monitors.click();

    }



}

