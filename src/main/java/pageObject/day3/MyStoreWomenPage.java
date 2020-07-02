package pageObject.day3;

import core.BaseFunc;
import model.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MyStoreWomenPage extends BaseFunc {

    public MyStoreWomenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class = 'right-block']")
    private List<WebElement> products;


    public void selectProduct(int i) {
        waitAllElementsAppeared(products);
        WebElement product = products.get(i);
        product.findElement(By.xpath("//a[@class='product-name']")).click();
    }
}



