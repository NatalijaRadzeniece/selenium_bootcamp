package pageObjects.HomeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.day2.UploadPage;

import java.util.ListIterator;


public class ProductPage extends BaseFunc {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

//    String theFilepath = System.getProperty("user.dir") + "\\src\\resources\\magic.jpg";

    @FindBy(how = How.XPATH, using = "//input[@name='option[218]' and @value='5']")
    private WebElement radioBtn;

    public void clickRadioBtn() {
        radioBtn.click();
    }


    @FindBy(how = How.XPATH, using = "//input[@name='option[223][]' and @value='11']")
    private WebElement checkBox;

    public void clickCheckBox() {
        checkBox.click();
    }

    @FindBy(how = How.CSS, using = "[id='input-option217']")
    private WebElement selectDD;

    public void selectFromDD(String optionName1) {
        selectByVisibletext(selectDD, optionName1);
    }


    @FindBy(how = How.CSS, using = "[id='input-option209']")
    private WebElement txtBox;

    public void setTxtToBox(String txtToSend) {
        txtBox.sendKeys(txtToSend);
    }


//input[@name='option[222]']
    @FindBy(how = How.XPATH, using = "//button[@id='button-upload222']")
    private WebElement uploadFileBtn;

    public void sendTheFile() {
        uploadFileBtn.click();
    }

//    @FindBy (how = How.CSS, using = "#product > div:nth-of-type(7) > div > span > button")
//    private  WebElement clckCalendar;

//    public void clckCalendarBtn() {
//        clckCalendar.click();
//    }

        @FindBy (how =How.CSS, using = "[name='option[219]']")
        private WebElement  myDate;
//
    public void setDateBox(double ) {
        myDate.clear();
        myDate.sendKeys(2011-02-09);
//    }



}
