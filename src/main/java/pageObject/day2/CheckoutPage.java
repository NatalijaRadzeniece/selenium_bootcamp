package pageObject.day2;

import core.BaseFunc;
import model.OrderInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BaseFunc {

    final Logger logger = LogManager.getLogger(OneATVPage.class);

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void settingCheckoutOptions() {
        logger.info("Setting Checkout Options value to Guest Checkout");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-sm-6']//input[@value='guest']")));
        driver.findElement(By.xpath("//div[@class='col-sm-6']//input[@value='guest']")).click();

        logger.info("Clicking Continue button");
        driver.findElement(By.id("button-account")).click();
    }

    public void populatingBillingDetails() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-guest")));
        driver.findElement(By.id("input-payment-firstname")).sendKeys("Egils");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("Levits");
        driver.findElement(By.id("input-payment-email")).sendKeys("blabla@gmail.com");
        driver.findElement(By.id("input-payment-telephone")).sendKeys("25555555");
        driver.findElement(By.id("input-payment-company")).sendKeys("Accenture");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("Brivibas 214");
        driver.findElement(By.id("input-payment-address-2")).sendKeys("Brivibas 201");
        driver.findElement(By.id("input-payment-city")).sendKeys("Rīga");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("LV1011");
        WebElement country = driver.findElement(By.id("input-payment-country"));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("Latvia");

        WebElement paymentZone = driver.findElement(By.id("input-payment-zone"));
        Select paymentZoneSelect = new Select(paymentZone);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='input-payment-zone']/option[text()='Rīga']")));
        paymentZoneSelect.selectByVisibleText("Rīga");

        driver.findElement(By.id("button-guest")).click();
    }

    public void deliveryMethod() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-shipping-method")));
        driver.findElement(By.id("button-shipping-method")).click();
    }

    public void paymentMethod() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-payment-method")));
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.id("button-payment-method")).click();
    }

    public OrderInfo verifyOrder() {
        OrderInfo orderInfo = new OrderInfo();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-confirm")));
        WebElement productLine = driver.findElement(By.xpath("//div[@id='collapse-checkout-confirm']//tbody/tr"));

        WebElement productName1 = productLine.findElement(By.xpath("td[1]"));
        orderInfo.productName1 = productName1.getText();

        WebElement quantity1 = productLine.findElement(By.xpath("td[3]"));
        orderInfo.quantity1 = Integer.parseInt(quantity1.getText());

        WebElement totalPrice = driver.findElement(By.xpath("//td[.//*[text()='Total:']]/following-sibling::td"));
        orderInfo.totalPrice = Double.parseDouble(totalPrice.getText().substring(1));

        return orderInfo;
    }

    public void confirmOrder() {
        driver.findElement(By.id("button-confirm")).click();
    }

}
