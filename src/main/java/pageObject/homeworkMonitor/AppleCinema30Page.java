package pageObject.homeworkMonitor;

import core.BaseFunc;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AppleCinema30Page extends BaseFunc {

    public AppleCinema30Page(WebDriver driver) {
        super(driver);
    }

    String path = System.getProperty("user.dir") + "\\src\\resources\\MyNewMonitor.jpg";

    @FindBy(how = How.NAME, using = "option[218]")
    private List<WebElement> radioButtons;

    @FindBy(how = How.NAME, using = "option[223][]")
    private List<WebElement> checkboxButtons;

    @FindBy(how = How.NAME, using = "option[208]")
    private WebElement textField;

    @FindBy(how = How.NAME, using = "option[217]")
    private WebElement dropDownColorYellow;

    @FindBy(how = How.NAME, using = "option[209]")
    private WebElement textAreaField;

    @FindBy(how = How.ID, using = "button-upload222")
    private WebElement uploadButton;

    @FindBy(how = How.ID, using = "input-option222")
    private WebElement fileInput;

    @FindBy(how = How.ID, using = "input-option219")
    private WebElement inputDate;

    @FindBy(how = How.NAME, using = "option[221]")
    private WebElement inputTime;

    @FindBy(how = How.NAME, using = "option[220]")
    private WebElement inputTimeAndDate;

    @FindBy(how = How.ID, using = "input-quantity")
    private WebElement setQuantity;

    @FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
    private WebElement buttonAddToCart;

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cartButton;

    @FindBy(how = How.XPATH, using = "//p[@class='text-right']")
    private WebElement checkoutButton;

    public void clickRadioSize(int i) {
        waitForTheListOfElements(radioButtons);
        radioButtons.get(i).click();
    }

    public void clickCheckboxButton(int i) {
        checkboxButtons.get(i).click();
    }

    public void writeInTextField(String text) {
        textField.click();
        textField.sendKeys(text);
    }

    public void selectColors(String color) {
        Select select = new Select(dropDownColorYellow);
        select.selectByValue(color);
    }

    public void writeInTextAreaField(String text) {
        textAreaField.sendKeys(text);
    }

    public void uploadFile() throws InterruptedException {
        String jse = "arguments[0].value='MyNewMonitor.jpg'";
        ((JavascriptExecutor) driver).executeScript(jse, fileInput);
        uploadButton.sendKeys(path);
    }

    public void setDateOnly() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        inputDate.clear();
        inputDate.sendKeys(date1);
    }

    public void setTimeOnly() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date time = new Date();
        String time1 = dateFormat.format(time);
        inputTime.clear();
        inputTime.sendKeys(time1);
    }

    public void setTimeAndDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date dateTime = new Date();
        String dateTime1 = dateFormat.format(dateTime);
        inputTimeAndDate.clear();
        inputTimeAndDate.sendKeys(dateTime1);
    }

    public void selectQuantity(String text) {
        setQuantity.clear();
        setQuantity.sendKeys(text);
    }

    public void clickAddToCartButton() {
        buttonAddToCart.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickCheckoutButton() {
        waitElementAppeared(checkoutButton);
        checkoutButton.findElement(By.xpath(".//a[contains(@href,'/checkout')]")).click();

    }
}
