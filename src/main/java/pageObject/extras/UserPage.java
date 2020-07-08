package pageObject.extras;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//h1")
    private WebElement notFound;

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public String notFoundMessage() {
        waitElementAppeared(notFound);
        return notFound.getText();
    }
}
