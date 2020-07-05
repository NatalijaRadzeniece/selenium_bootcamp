package pageObject.day2.PROJECT;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DateTime extends BaseFunc {


    @FindBy(how = How.CSS, using = ".picker-open .datepicker-years")
    private WebElement yearPicker;

    @FindBy(how = How.CSS, using = ".picker-open .datepicker-months")
    private WebElement monthPicker;

    @FindBy(how = How.CSS, using = ".picker-open .datepicker-days")
    private WebElement dayPicker;

    @FindBy(how = How.CSS, using = ".picker-open .timepicker-hour")
    private WebElement hourPickerButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'picker-open')]//div[contains(@class, 'timepicker-hours')]")
    private WebElement hourPicker;

    @FindBy(how = How.CSS, using = ".picker-open .timepicker-minute")
    private WebElement minutePickerButton;

    @FindBy(how = How.CSS, using = ".picker-open a[data-action=\"incrementMinutes\"]")
    private WebElement incrementMinutesButton;

    @FindBy(how = How.CSS, using = ".picker-open a[data-action=\"decrementMinutes\"]")
    private WebElement decrementMinutesButton;

    @FindBy(how = How.CSS, using = ".picker-open .picker-switch.accordion-toggle")
    private WebElement timeSelectButton;

    public DateTime(WebDriver driver) {
        super(driver);
    }

    public void selectDate(String year, String month, String day){

        dayPicker.findElement(By.cssSelector(".picker-switch")).click();
        monthPicker.findElement(By.cssSelector(".picker-switch")).click();

        yearPicker.findElement(By.xpath(".//span[contains(text(), '" + year + "')]")).click();

        monthPicker.findElement(By.xpath(".//span[contains(text(), '" + month + "')]")).click();

        dayPicker.findElement(By.xpath(".//td[contains(text(), '" + day + "')]")).click();
    }

    public void selectTime(String hours, String minutes){
        waitElementAppeared(hourPickerButton);
        hourPickerButton.click();
        waitElementAppeared(hourPicker);

        hourPicker.findElement(By.xpath(".//td[@class='hour' and contains(text(), '" + hours + "')]")).click();

        int currentMinutes =  Integer.parseInt(minutePickerButton.getText());
        int neededMinutes = Integer.parseInt(minutes);

        WebElement changeMinutesButton;

        if(neededMinutes > currentMinutes){
            changeMinutesButton = incrementMinutesButton;
        }else{
            changeMinutesButton = decrementMinutesButton;
        }

        while(currentMinutes != neededMinutes){
            changeMinutesButton.click();
            currentMinutes = Integer.parseInt(minutePickerButton.getText());
        }
    }

    public void openTimeSelect(){
        timeSelectButton.click();
    }
}
