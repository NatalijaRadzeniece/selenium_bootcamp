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
    public void practiceWithWebElement() throws InterruptedException {
        //WebElement elementCss = driver.findElement(By.id("id"));
        //String cssText = elementCss.getCssValue("css value");

        //find element "Chapter 1" and  click on it
        WebElement resultButton = driver.findElement(By.xpath("//a[@href='/chapter1']"));
        resultButton.click();
        // clear text from text box
        WebElement textBox = driver.findElement(By.xpath("//div[@id='html5div']"));
        textBox.clear();
        //  and send text to same text box
        textBox.sendKeys("And his name is JOHN CENA!!!");

        //from element "Click this link to launch another window" print out text
        WebElement textWindow = driver.findElement(By.id("multiplewindow"));
        String text = textWindow.getText();
        String textOfElement = driver.findElement(By.id("multiplewindow")).getText();
        System.out.println(driver.findElement(By.id("multiplewindow")).getText());
        //from "Verify button" get attribute ( any you like) and print out
        System.out.println(driver.findElement(By.id("verifybutton")).getAttribute("value"));

        //from header " Selenium: Beginners Guide" get cssValue color also print out it
        System.out.println(driver.findElement(By.className("mainheading")).getCssValue("color"));

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
