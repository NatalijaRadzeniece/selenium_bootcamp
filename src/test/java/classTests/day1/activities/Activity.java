package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    private WebDriver driver;
    private String url = "https://www.google.com/";

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\" + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void driverTest() {
        driver.get(url);
        System.out.println(driver.getCurrentUrl());
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
