package pageObject.extras;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HoversPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//img[@alt='User Avatar']")
    private WebElement userAvatar;

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public void clickViewProfile() {
        Actions actions = new Actions(driver);
        actions.moveToElement(userAvatar).moveToElement(driver.findElement(By.xpath(".//a[contains(text(),'View profile')]"))).click().build().perform();
    }
}

