package pageObject.finalWork;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPlacesPage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(OrderPlacesPage.class);

    public OrderPlacesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Your order has been placed!')]")
    private WebElement orderPlaced;

    @FindBy(how = How.XPATH, using = "//span[@id='cart-total']")
    private WebElement emptyCard;

    public String getTextFromOrderElements() {
        waitElementAppeared(orderPlaced);
        return orderPlaced.getText();

    }

    public String verifyEmptyCard() {
        LOGGER.info("verify empy card");
        return emptyCard.getText();
    }

}