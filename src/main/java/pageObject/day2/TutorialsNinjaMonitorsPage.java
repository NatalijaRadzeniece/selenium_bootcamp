package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TutorialsNinjaMonitorsPage extends BaseFunc {
    public TutorialsNinjaMonitorsPage(WebDriver driver){
        super(driver);
    }
    public void selectProductByName(String name){
        WebElement addProductSpan = this.driver.findElement(By.xpath("//div[div[@class='caption']/h4/a[text()='" + name + "']]//span[text()='Add to Cart']"));
        addProductSpan.click();
    }
}
