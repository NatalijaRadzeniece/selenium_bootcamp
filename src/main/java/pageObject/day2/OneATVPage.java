package pageObject.day2;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class OneATVPage extends BaseFunc {

    final Logger logger = LogManager.getLogger(getClass());

    public OneATVPage(WebDriver driver) {
        super(driver);
    }

    public void selectOptionsAndAddToCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='option[218]']")));

        logger.info("Setting Radio value to Large (+$36.00)");
        driver.findElement(By.xpath("//div[@id='input-option218']//input[@value=7]")).click();

        logger.info("Setting Checkbox value to Checkbox 4 (+$48.00)");
        driver.findElement(By.xpath("//div[@id='input-option223']//input[@value=11]")).click();

        logger.info("Setting Text");
        WebElement text = driver.findElement(By.xpath("//div[label[text()='Text']]/input"));
        text.clear();
        text.sendKeys("The big brown fox jumps over the lazy dog");

        logger.info("Setting Color");
        WebElement colorElement = driver.findElement(By.id("input-option217"));
        Select colorSelect = new Select(colorElement);
        colorSelect.selectByVisibleText("Yellow (+$2.40)");

        logger.info("Setting Textarea");
        driver.findElement(By.id("input-option209")).sendKeys("Lorem ipsum dolor sit amet");

        logger.info("Selecting file and uploading");
        File file = new File(getClass().getResource("/cartoon-unicorn-png-2.png").getFile());
        driver.findElement(By.id("button-upload222")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type = 'file']")));
        WebElement fileInput = driver.findElement(By.xpath("//input[@type = 'file']"));
        fileInput.sendKeys(file.getAbsolutePath());

        logger.info("Dismissing Alert");
        wait.until(ExpectedConditions.alertIsPresent());
        Alert fileUploadedSuccessfully = driver.switchTo().alert();
        fileUploadedSuccessfully.dismiss();

        logger.info("Setting Date");
        WebElement date = driver.findElement(By.id("input-option219"));
        date.clear();
        date.sendKeys("2020-07-05");

        logger.info("Setting Time");
        WebElement time = driver.findElement(By.xpath("//div[contains(@class, 'time')]/input"));
        time.clear();
        time.sendKeys("17:31");

        logger.info("Setting Date & Time");
        WebElement dateAndTime = driver.findElement(By.xpath("//div[label[text()='Date & Time']]//input"));
        dateAndTime.clear();
        dateAndTime.sendKeys("2020-07-05 17:31");

        logger.info("Setting Qty");
        WebElement quantity = driver.findElement(By.id("input-quantity"));
        quantity.clear();
        quantity.sendKeys("2");

        logger.info("Adding to cart");
        driver.findElement(By.id("button-cart")).click();
    }

    public void proceedingToCheckout() {
        driver.findElement(By.className("btn-inverse")).click();

        By searchCondition = By.xpath("//a[strong[contains(text(), 'Checkout')]]");
        wait.until(ExpectedConditions.elementToBeClickable(searchCondition));
        WebElement checkoutAnchor = driver.findElement(searchCondition);

        checkoutAnchor.click();
    }
}
