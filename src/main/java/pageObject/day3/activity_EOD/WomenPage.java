package pageObject.day3.activity_EOD;

import core.BaseFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WomenPage extends BaseFunc {
    public WomenPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//img[@title='Faded Short Sleeve T-shirts']")
    private WebElement clickShirt;





    public void clickOnPic() throws InterruptedException {
        Thread.sleep(2000);
        clickShirt.click();
    }




}
