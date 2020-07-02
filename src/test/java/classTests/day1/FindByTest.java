package classTests.day1;

import org.junit.*;
import org.openqa.selenium.*;
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
        driver.get(url);
        WebElement textUnbelievable = driver.findElement(By.className("unbelievable"));
        WebElement buttonOne = driver.findElement(By.xpath("//input[@value='This is a button']"));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
