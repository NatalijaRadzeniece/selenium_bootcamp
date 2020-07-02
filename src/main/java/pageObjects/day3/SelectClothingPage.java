package pageObjects.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class SelectClothingPage extends BaseFunc {
    public SelectClothingPage(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;                         //soory for these path, they taking a lot of time to find
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElement shirt;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")
    private WebElement blouse;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    private WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    private WebElement continueShoping;

    @FindBy(how = How.XPATH, using = "//*[@id=\"columns\"]/div[1]/a[2]")
    private WebElement backToList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    private WebElement ToCheckout;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    private WebElement checkOut;


    public void clickOnShirt() {
        waitForTheWebElement(shirt);
        shirt.click();
    }

    public void clickButtonAddToCart() {
        waitForTheWebElement(addToCart);
        addToCart.click();
    }

    public void clickOnBlouse() {
        blouse.click();
    }

    public void clickContinueShoping() {
        waitForTheWebElement(continueShoping);
        continueShoping.click();
    }

    public void clickBackToList() {
        waitForTheWebElement(backToList);
        backToList.click();
    }

    public void clickToCheckout() {
        waitForTheWebElement(ToCheckout);
        ToCheckout.click();
    }

    public void clickToPurchase() {
        waitForTheWebElement(checkOut);
        checkOut.click();
    }


}


