package classTests.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTest {
    private WebDriver driver;
    private String url = "https://kristinek.github.io/site/examples/actions";

    @Before
    public void setDriver() {
        String userdirLib = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
//        LOGGER.info("Browser window maximize");
        driver.manage().window().maximize();
    }

    @Test
    public void findBy() {

//        LOGGER.info("Navigate to");
        driver.get(url);

        WebElement inputText = driver.findElement(By.id("text"));
        inputText.clear();
        inputText.sendKeys("Hello, World!");
        WebElement resultButton = driver.findElement(By.id("result_button_text"));
        resultButton.click();

        WebElement checkBox1 = driver.findElement(By.cssSelector("[id='vfb-6-0']"));
        checkBox1.click();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
