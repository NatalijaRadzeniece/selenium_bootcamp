package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmOrderPage extends BaseFunc {
    public ConfirmOrderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement confirm;

    public void ClickConfirmButton() {
        confirm.click();
    }

}
