package classTests.day1.activities;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    WebDriver driver;
    final String url = "http://book.theautomatedtester.co.uk/";

    @Before
    public void setDriver() {
        String userdirLib = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void practiceWithWebElement() {
        //find element "Chapter 1" and  click on it
        WebElement linkChapter1 = driver.findElement(By.linkText("Chapter1"));
        linkChapter1.click();

        // clear text from text box
        WebElement textBox = driver.findElement(By.cssSelector(".belowcenter"));
        textBox.clear();

        //  and send text to same text box
        textBox.sendKeys("I am Nanajka");

        //from element "Click this link to launch another window" print out text
        WebElement someDivElement = driver.findElement(By.id("multiplewindow"));
        System.out.println(someDivElement.getText());

        //from "Verify button" get attribute ( any you like) and print out
        WebElement verifyButton = driver.findElement(By.id("verifybutton"));
        System.out.println(verifyButton.getAttribute("value"));

        //from header " Selenium: Beginners Guide" get cssValue color also print out it
        WebElement header = driver.findElement(By.className("mainheading"));
        System.out.println(header.getCssValue("font-family"));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
