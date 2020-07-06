package pageObject.day2HomeWork;

import core.BaseFunc;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class YSAppleMonitorPage extends BaseFunc {



    public YSAppleMonitorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "option[218]")
    private List<WebElement> radioOption;

    @FindBy(how = How.NAME, using = "option[223][]")
    private List<WebElement> checkBoxOption;

    @FindBy(how = How.NAME, using = "option[208]")
    private WebElement textOption;

    @FindBy(how = How.TAG_NAME, using = "option")
    private List<WebElement> selectOption;

    @FindBy(how = How.NAME, using = "option[209]")
    private WebElement textAreaOption;

    @FindBy(how = How.ID, using = "button-upload222")
    private WebElement uploadFileOption;

    @FindBy(how = How.NAME, using = "option[219]")
    private WebElement dateOption;

    @FindBy(how = How.NAME, using = "option[221]")
    private WebElement timeOption;

    @FindBy(how = How.NAME, using = "option[220]")
    private WebElement dateAndTimeOption;

    @FindBy(how = How.ID, using = "button-cart")
    private WebElement addToCartButton;

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement CartButton;

    @FindBy(how = How.XPATH, using = "//p[@class='text-right']")
    private WebElement checkOutButton;

    public void clickRadioOption(int i) {
        waitAllElementsAppeared(radioOption);
        radioOption.get(i).click();
    }

    public void clickCheckBoxOption(int i) {
        checkBoxOption.get(i).click();
    }

    public void fillTextOption(String text) {
        textOption.clear();
        textOption.sendKeys(text);
    }

    public void clickSelectOption(int i) {
        selectOption.get(i).click();
    }

    public void fillTextAreaOption(String text) {
        textAreaOption.sendKeys(text);
    }

    public void uploadFile() throws AWTException {

        File file = null;

        try {
            file = new File(YSAppleMonitorPage.class.getClassLoader().getResource("Accenture-Main-Content-Column-Image.jpg").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        uploadFileOption.click();

        StringSelection ss = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();

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
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(3000);
    }

    public void setDateOption(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String date1 = dateFormat.format(date);

        dateOption.clear();
        dateOption.sendKeys(date1);

    }

    public void setTimeOption(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date time = new Date();
        String time1 = dateFormat.format(time);

        timeOption.clear();
        timeOption.sendKeys(time1);

    }

    public void setDateAndTimeOption(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date dateAndTime = new Date();
        String dateAndTime1 = dateFormat.format(dateAndTime);

        dateAndTimeOption.clear();
        dateAndTimeOption.sendKeys(dateAndTime1);

    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickCartButton(){
        CartButton.click();
    }

    public void clickCheckOutButton(){
        waitElementAppeared(checkOutButton);
        checkOutButton.findElement(By.xpath(".//a[contains(@href,'/checkout')]")).click();
    }
}
