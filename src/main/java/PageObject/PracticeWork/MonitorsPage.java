package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonitorsPage extends BaseFunc {
    public MonitorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH,using = "//a[contains (text(),'Apple Cinema 30')]")
    private WebElement appleCinema;

    public void ProductClick(){
       appleCinema.click();

    }

//    public Monitor SelectItem (int i) {
//        Monitor monitor = new Monitor();
//        WebElement apple = appleCinema.get(i);
//
//        apple.click();
//        return monitor;
//    }
}




