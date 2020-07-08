package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTest {

    private WebDriver driver;
    private String url = "https://kristinek.github.io/site/examples/locators";

    @Before
    public void setDriver() {
        String userdirLib = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void findBy() {
       // WebElement textUnbelievable = driver.findElement(By.className("text_unbelievable"));
        WebElement buttonOne = driver.findElement(By.xpath("//input[@value='This is a button']"));

    }

    @After
    public void closeBrowser() {

        driver.quit();
    }

}