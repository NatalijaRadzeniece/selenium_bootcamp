package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ClothesPage extends BaseFunc {

    public ClothesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement womenLink;

    public void clickOnWomen() {
        womenLink.click();
    }

    @FindBy(how = How.XPATH, using = "//div[contains (@class,'product-container')]")
    private List<WebElement> allProductContainers;

    public void waitUntilProductPageLoaded()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("block_contact_infos")));
        allProductContainers = driver.findElements(By.xpath("//div[contains (@class,'product-container')]"));
    }

    public void addToCart(int i) throws InterruptedException {
        WebElement container = allProductContainers.get(i);


        Actions actions = new Actions(driver);
        Actions moveCursorToContainer = actions.moveToElement(container);
        moveCursorToContainer.perform();
    }

}

