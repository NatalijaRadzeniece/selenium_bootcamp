package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ClothesCartPage extends BaseFunc {

    public ClothesCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//tr[starts-with(@id, 'product_')]")
    private List<WebElement> allCartItems;

    public ProductInfo getProductInfo(int i){
        System.out.println(allCartItems.size());

        ProductInfo productInfo = new ProductInfo();
        return productInfo;

    }

}
