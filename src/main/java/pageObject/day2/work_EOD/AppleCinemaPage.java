package pageObject.day2.work_EOD;

import core.BaseFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class AppleCinemaPage extends BaseFunc {
    public AppleCinemaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='input-option218']/div[2]/label/input")
    private WebElement radiBut;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option223']/div[3]/label/input")
    private WebElement checkBox;

    @FindBy(how = How.XPATH, using = "//input[@name='option[208]']")
    private WebElement inputText;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option217']")
    public WebElement drop;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option217']/option[2]")
    public WebElement dropCol;

    @FindBy(how = How.NAME, using = "option[209]")
    private WebElement textArena;

    @FindBy(how = How.ID, using = "input-option222")
    private WebElement inputFile;

    @FindBy(how = How.ID, using = "button-upload222")
    private WebElement uploadFile;

    @FindBy(how = How.NAME, using = "option[219]")
    private WebElement inputDate;

    @FindBy(how = How.NAME, using = "option[221]")
    private WebElement inputTime;

    @FindBy(how = How.NAME, using = "option[220]")
    private WebElement inputDateTime;

    @FindBy(how = How.NAME, using = "quantity")
    private WebElement inputQuantity;

    @FindBy(how = How.ID, using = "button-cart")
    private WebElement addToCart;

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement clickCart;

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'/checkout')]")
    private WebElement clickCheckout;

    public void clickRad() {
        radiBut.click();
    }

    public void clickCheck() {
        checkBox.click();
    }

    public void inputText(String text) {
        inputText.clear();
        inputText.sendKeys(text);
    }

    public void chooseColor() {
        drop.click();
        dropCol.click();
    }

    public void inputTextArena(String text1) {
        textArena.clear();
        textArena.sendKeys(text1);
    }

    public void setFile() throws InterruptedException {
        String path = System.getProperty("user.dir") + "\\src\\resources\\IMG_20200630_161954.jpg";
        String jse = "arguments[0].value='IMG_20200630_161954.jpg'";
        ((JavascriptExecutor) driver).executeScript(jse, inputFile);
        uploadFile.sendKeys(path);
    }

    public void setDate(String date) {
        inputDate.clear();
        inputDate.sendKeys(date);
    }

    public void setTime(String time) {
        inputTime.clear();
        inputTime.sendKeys(time);
    }

    public void setDateAndTime(String date, String time) {
        inputDateTime.clear();
        inputDateTime.sendKeys(date + " " + time);
    }

    public void setQuant(String qt) {
        inputQuantity.clear();
        inputQuantity.sendKeys(qt);
    }

    public void clickAddCart() {
        addToCart.click();
    }

    public void clickCart() {
        clickCart.click();
    }

    public void clickCheckout() {
        clickCheckout.click();
    }


}
