package pageObject.Day3;

import core.BaseFunc;
import model.Article;
import model.AutomationPageM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SecondAutomationPage extends BaseFunc {
    public SecondAutomationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//li[contains(@class, 'ajax_block_product ')]")
    List<WebElement> allProducts;

    public AutomationPageM getProductTitleAndPrice(Integer i) {
        AutomationPageM productTitleAndPrice = new AutomationPageM();
        WebElement currentProduct = allProducts.get(i);
        String productTitle = currentProduct.findElement(By.xpath("//a[@class='product-name' ]")).getText();
        productTitleAndPrice.setTitle(productTitle);

        String productPrice = currentProduct.findElement(By.xpath("//div/span[@class='price product-price' ]")).getText();
        productTitleAndPrice.setPrice(Double.valueOf(productPrice));

        currentProduct.click();

        return productTitleAndPrice;
    }

}
//    @FindBy(how = How.XPATH, using = "//img[@title='Blouse' ]")
//    private WebElement blouse;


