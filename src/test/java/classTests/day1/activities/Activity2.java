package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    WebDriver driver;

    @Before
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk/");
    }


    @Test
    public void practiceWithWebElement() {

        //find element "Chapter 1" and  click on it
        WebElement chapterOne = driver.findElement(By.linkText("Chapter1"));
        chapterOne.click();

        // clear text from text box
        WebElement textBox = driver.findElement(By.id("html5div"));
        textBox.clear();
        textBox.sendKeys("Hello world");

        //  and send text to same text box

        //from element "Click this link to launch another window" print out text
        System.out.println(driver.findElement(By.id("multiplewindow")).getText());
        System.out.println(driver.findElement(By.id("verifybutton")).getAttribute());
        System.out.println(driver.findElement(By.className("mainheading")).getCssValue("colour"));

        //from "Verify button" get attribute ( any you like) and print out
        //from header " Selenium: Beginners Guide" get cssValue color also print out it


    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
