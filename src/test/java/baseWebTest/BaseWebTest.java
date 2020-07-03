package baseWebTest;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

// Base Test class where driver methods and set up located
public class BaseWebTest {

    protected WebDriver driver;

    //Annotation @BeforeClass will be run before each test class which extends this class
    @BeforeClass
    public void setUp() {
        //instead of add whole path, we can get path by using System.getProperty
        String userdirLib = System.getProperty("user.dir") + "\\lib\\";
        //path to driver .exe file
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        //initializing driver
        this.driver = new ChromeDriver();
        // maximizing browser window
        this.driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://" + url;
        }
        driver.get(url);
    }

    //Annotation @AfterClass will be run after each test class which extends this class
    @AfterClass
    public void closeBrowser() {
        Assertions.assertNotNull(driver, "Window already closed");
        driver.quit();
    }

}