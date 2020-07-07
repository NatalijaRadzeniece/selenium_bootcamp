package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPlacedPage extends BaseFunc {

    public OrderPlacedPage(WebDriver driver) {
        super(driver);
    }

    public String orderPlacingResult() {
//        wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.id("accordion"))));
//        Not working, unfortunately, see workaround below

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("accordion")));
        return driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
    }

    public String cartButtonText() {
        return driver.findElement(By.id("cart-total")).getText();
    }
}
