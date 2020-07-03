package PageObject.Day_3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FirstItemPage extends BaseFunc {

    public FirstItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH,using = ".//span [contains(text(), 'Add to cart')]")
            private WebElement addToCartButton;

            public void ClickAddtoCartButton (){
            addToCartButton.click();
            }
}

