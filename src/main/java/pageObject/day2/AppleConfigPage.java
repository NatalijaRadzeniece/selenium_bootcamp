package pageObject.day2;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AppleConfigPage extends BaseFunc {
    final static Logger LOGGER = LogManager.getLogger(AppleConfigPage.class);

    public AppleConfigPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//div[@id='input-option218']//div[2]//label[1]")
    private WebElement medium;

    @FindBy(how = How.XPATH, using = "//div[@id='input-option223']//div[2]//label[1]")
    private WebElement checkbox2;

    @FindBy(how = How.XPATH, using = "//div[@id='input-option223']//div[3]//label[1]")
    private WebElement checkbox3;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option208']")
    private WebElement text;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'Red')]")
    private WebElement select;

    @FindBy(how = How.XPATH, using = "//textarea[@id='input-option209']")
    private WebElement textarea2;

    @FindBy(how = How.XPATH, using = "//button[@id='button-upload222']")
    private WebElement fileUpload;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option219']")
    private WebElement date;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option221']")
    private WebElement time;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option220']")
    private WebElement timeAndDay;

    @FindBy(how = How.XPATH, using = "//input[@id='input-quantity']")
    private WebElement qty;

    @FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
    private WebElement addCart;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement items;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Checkout')]")
    private WebElement checkout;


    public void clickOnConfig() {
        waitElementAppeared(medium);
        medium.click();
        checkbox2.click();
        checkbox3.click();


    }

    public void setText() {
        text.clear();
        text.sendKeys("test");
        textarea2.clear();
        textarea2.sendKeys("test2");
        date.clear();
        date.sendKeys("2011-02-21");
        time.clear();
        time.sendKeys("22:24");
        timeAndDay.clear();
        timeAndDay.sendKeys("2011-02-27 22:24");
        qty.clear();
        qty.sendKeys("2");

    }

    public void setSelect() {
        select.click();

    }


    public void upload() {
        String filePath = System.getProperty("user.dir") + "\\src\\resources\\selenium task.png";
        fileUpload.click();
        StringSelection ss = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Robot robot = null;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(250);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(250);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(250);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(250);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(250);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(250);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void clickAddToCart() {
        addCart.click();
        items.click();
        waitElementAppeared(checkout);
        checkout.click();
    }


}

//    public void upload(){
//        fileUpload.sendKeys("C:\\Users\\nazar\\IdeaProjects\\selenium_bootcamp\\src\\resources\\selenium task.png");
//    }








