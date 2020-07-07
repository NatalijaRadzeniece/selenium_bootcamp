package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPlacedPage extends BaseFunc {

    public OrderPlacedPage(WebDriver driver) {
        super(driver);
    }

    public String orderPlacingResult() {
        return driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
    }

    public String cartButtonText() {
        return driver.findElement(By.id("cart-total")).getText();
    }
}
