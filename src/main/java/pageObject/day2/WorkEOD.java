package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkEOD extends BaseFunc {

    public WorkEOD(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "HomePage")
    public WebElement homePage;

    public void clickHomePage() {
        homePage.click();
    }
}


