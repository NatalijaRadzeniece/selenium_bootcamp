package pageObject.day2HomeWork;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YSSuccessPage extends BaseFunc {

    public String confirmation;
    public String cartStatus;

    public YSSuccessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "cart")
    private WebElement cartButton;

    @FindBy(how = How.ID, using = "content")
    private WebElement orderPlaced;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Success')]")
    private WebElement successPage;

    public void orderPlacedConfirmation(){
        waitElementAppeared(successPage);
        confirmation = orderPlaced.findElement(By.xpath(".//h1")).getText();
    }

    public void clickCartButton(){
        cartButton.click();
        cartStatus = cartButton.findElement(By.tagName("p")).getText();
    }

}
