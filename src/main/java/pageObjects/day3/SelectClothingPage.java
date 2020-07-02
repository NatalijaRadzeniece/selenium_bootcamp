package pageObjects.day3;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SelectClothingPage extends BaseFunc {
    public SelectClothingPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(how = How.XPATH, using = "//div[@class='product-container']")
        private List<WebElement> articleOfClothing;

    public void addProductToCart() {
        waitForTheListOfElements(articleOfClothing);
        articleOfClothing.get(2);

    }






}


