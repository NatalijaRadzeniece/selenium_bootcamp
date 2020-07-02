package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TutorialsNinjaPage extends BaseFunc {

    private WebDriver driver;

    public TutorialsNinjaPage (WebDriver driver){
        super (driver);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Components')]")
    private WebElement componentsDropdown;

    public void clickComponents(){
        componentsDropdown.click();
        }

    public void clickMonitors(){
       driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
    }


}
