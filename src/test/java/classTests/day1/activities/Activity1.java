package samplesPages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void finElements() {

        //find element "Search field"
        WebElement searchField = driver.findElement(By.id("search_query_top"));

        //find element "magnifier glass"
        WebElement magnifier = driver.findElement(By.name("submit_search"));

        // find element in menu "Woman"
        WebElement menuWoman = driver.findElement(By.xpath("//a[@title='Women']"));


    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }


}
