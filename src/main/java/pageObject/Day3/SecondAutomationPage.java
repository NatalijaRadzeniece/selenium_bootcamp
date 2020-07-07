package pageObject.Day3;

import core.BaseFunc;
import model.Article;
import model.AutomationPageM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SecondAutomationPage extends BaseFunc {
    public SecondAutomationPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(how = How.XPATH, using = "//h5[contains(@itemprop, 'name')]")
//    List<WebElement> allTitles;

    @FindBy(how = How.XPATH, using = "//div[@class='product-container']")
    List<WebElement> allProducts;

////div[contains(@class, 'product-container')]
////li[contains(@class, 'ajax_block_product ')]
//    public void clickTitle (int i){
//        waitUntilVisabilyOfAllElements(allTitles);
//        allTitles.get(i).click();
//}
    public AutomationPageM getProductTitleAndPrice(Integer i) {
        waitUntilVisabilyOfAllElements(allProducts);

        AutomationPageM productTitleAndPrice = new AutomationPageM();

        WebElement currentProduct = allProducts.get(i);
        String title = currentProduct.findElement(By.xpath("//a[@class='product-name']")).getText();
        productTitleAndPrice.setTitle(title);

        //WebElement currentPrice = allProducts.get(i);
        List<WebElement> pricesAll = currentProduct.findElements(By.xpath("//span[@class='price product-price']"));
        //String price = currentPrice.findElement(By.xpath("//span[@class='price product-price']")).getText();
        WebElement priceCurrent = pricesAll.get(0);
        String priceText = priceCurrent.getText();
        productTitleAndPrice.setPrice(priceText);


       // productTitleAndPrice.setPrice(Double.valueOf(price));

        currentProduct.click();

        return productTitleAndPrice;
    }

}


