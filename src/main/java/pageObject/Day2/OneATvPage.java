package pageObject.Day2;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

    public class OneATvPage extends BaseFunc {
        public OneATvPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//div[contains(@class, 'product__hover')]")
        private List<WebElement> products;


        public void printProductDetails(int i) {
            WebElement product = products.get(i);
            String productName = product.findElement(By.xpath(".//a[contains(@class, 'product__name')]")).getText();
            String price = product.findElement(By.xpath(".//span[@class= 'item-price']")).getText();
            System.out.println(productName + "\n" + price);
        }
    }