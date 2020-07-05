package pageObject.day2.PROJECT;

import core.BaseFunc;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class NinjaApplePage extends BaseFunc {

    protected WebDriver driver;

    @FindBy(how = How.CSS, using = "div#input-option218 input[value=\"6\"]")
    private WebElement radioButton;
    @FindBy(how = How.CSS, using = "div#input-option223 input[value=\"10\"]")
    private WebElement checkBox;
    @FindBy(how = How.CSS, using = "input[value=\"test\"]")
    private WebElement textBox;
    @FindBy(how = How.CSS, using = "select[name=\"option[217]\"]")
    private WebElement selectDropdown;
    @FindBy(how = How.CSS, using = "textarea[placeholder=\"Textarea\"]")
    private WebElement textArea;
    @FindBy(how = How.CSS, using = "button[class=\"btn btn-default btn-block\"]")
    private WebElement fileUpload;
    @FindBy(how = How.CSS, using = "div[class=\"input-group date\"] button[class=\"btn btn-default\"]")
    private WebElement date;
    @FindBy(how = How.CSS, using = "div[class=\"input-group time\"] button[class=\"btn btn-default\"]")
    private WebElement time;
    @FindBy(how = How.CSS, using = "div[class=\"input-group datetime\"] button[class=\"btn btn-default\"]")
    private WebElement dateAndTime;
    @FindBy(how = How.CSS, using = "#button-cart")
    private WebElement addToCartButton;
    @FindBy(how = How.CSS, using = "#cart-total")
    private WebElement cartButton;
    @FindBy(how = How.CSS, using = "a[href=\"http://tutorialsninja.com/demo/index.php?route=checkout/checkout\"]")
    private WebElement checkoutButton;

    public NinjaApplePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickMediumRadioButton() {
        waitElementAppeared(radioButton);
        radioButton.click();
    }


    public void clickOnCheckBox3() {
        checkBox.click();
    }


    public void clearTextBox() {
        textBox.clear();
    }

    public void writeText() {
        textBox.sendKeys("Most popular choice!");
    }


    public void selectOption() {
        Select select = new Select(selectDropdown);
        select.selectByValue("3");
    }


    public void writeTextarea() {
        textArea.sendKeys("Lorem ipsum is a pseudo-Latin text used in web design, typography, layout, and printing in place of English to emphasise design elements over content. It's also called placeholder (or filler) text. It's a convenient tool for mock-ups. It helps to outline the visual elements of a document or presentation, eg typography, font, or layout. Lorem ipsum is mostly a part of a Latin text by the classical author and philosopher Cicero.");
    }


    public void clickFileUpload() {
        //fileUpload.click();
        String filePath = System.getProperty("user.dir") + "\\src\\resources\\squid.jpg";
        fileUpload.click();

        //put path to your image in a clipboard
        StringSelection ss = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }


    public void selectDate() {
        date.click();
        DateTime dateTime = new DateTime(driver);
        dateTime.selectDate("2020", "Mar", "12");
    }

    public void selectTime() {
        time.click();
        DateTime dateTime = new DateTime(driver);
        dateTime.selectTime("03", "01");
        time.click();
    }

    public void selectDateAndTime() {
        dateAndTime.click();
        DateTime dateTime = new DateTime(driver);
        dateTime.selectDate("2020", "Mar", "12");
        dateTime.openTimeSelect();
        dateTime.selectTime("12", "59");
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}
