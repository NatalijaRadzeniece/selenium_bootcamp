package samplesPages;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

//This class extends BaseCore - it will allow to use methods from BaseClass without declaring it.
public class PageFactorySamplePage extends BaseFunc {

    //constructor, which passes driver to superClass ( BaseFunc)
    public PageFactorySamplePage(WebDriver driver) {
        // super() is used to call the immediate parent (BaseFunc.java) constructor
        //since in BaseCore.java initialized driver, we added in () "driver"
        // fast way to create constructor - alt+insert
        super(driver);
    }

    //Page Factory - his how it declares WebElements to locator
    // this will return One web element
    @FindBy(how = How.ID, using = "id")
    public WebElement ids;

    //returning list of web elements
    @FindBy(how = How.XPATH, using = ".//span[@type='type-name']")
    private List<WebElement> types;

    //some methods done here
    public void clickElement() {
        //some code
    }


}
