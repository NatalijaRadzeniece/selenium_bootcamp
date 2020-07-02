package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class CheckoutPage extends BaseFunc {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//td[@id='total_price_container']")
    private WebElement totalPrice;

    @FindBy(how = How.XPATH, using = "//td[@id='total_shipping']")
    private WebElement shippingPrice;

    @FindBy(how = How.XPATH, using = "//p[@class='product-name']")
    private List<WebElement> body;

    public String getTotalPrice() {
        waitElementAppeared(totalPrice);

        return totalPrice.getText();
    }

    public String getShippingPrice() {
        waitElementAppeared(shippingPrice);

        return shippingPrice.getText();
    }

                    public ArrayList<String> getDressNameList() {
                    ArrayList<String> nameList = new ArrayList<String>();
                    for (WebElement element : body) {
                        nameList.add(element.getText());
                    }

                    //first is empty
                    nameList.remove(0);

                    return nameList;
                }
            }
