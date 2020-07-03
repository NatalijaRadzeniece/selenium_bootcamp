package PageObject.Day_3;

import core.BaseFunc;
import model.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WomenPage extends BaseFunc {


    public WomenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='product-name']")
    private List<WebElement> firstItemButton;

    //public void clickFirstItemButton (){

    //firstItemButton.click();

    public AutomationPracticePage SelectItem(Integer i) {
        AutomationPracticePage selectItem = new AutomationPracticePage();
        WebElement product = firstItemButton.get(i);

        product.click();
        return selectItem;
    }

}




