package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class ElementPage1 extends BaseFunc {
    public ElementPage1(WebDriver driver){
        super(driver);

    }
    @FindBy(how = How.LINK_TEXT, using = "Chapter1")
    private WebElement chapter1;

//    @FindBy(how=How.ID, using = "") needs to be finished
}
