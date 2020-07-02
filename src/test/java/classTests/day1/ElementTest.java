package classTests.day1;

import classTests.day2.AlertTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class ElementTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);
   private  WebDriver driver;

    @BeforeClass
    public void setDriver() {
        String userdirLib = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void findBy() {
        LOGGER.info("Navigate to");
        driver.get("https://kristinek.github.io/site/examples/actions");
        WebElement inputText = driver.findElement(By.id("text"));
        inputText.clear();
        inputText.sendKeys("Hello World!");
        WebElement resultButton = driver.findElement(By.id("result_button_text"));
        resultButton.click();

        WebElement checkBox1 = driver.findElement(By.cssSelector("[id='vfb-6-0'"));
        checkBox1.click();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }


}