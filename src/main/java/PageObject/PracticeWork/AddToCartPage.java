package PageObject.PracticeWork;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class AddToCartPage extends BaseFunc {
    public AddToCartPage(WebDriver driver) {

        super(driver);
    }

    String path = System.getProperty("user.dir") + "\\src\\resources\\DSCF6038.JPG";


    @FindBy(how = How.XPATH, using = "//input[@value = '6']")
    private WebElement radioOpt;

    public void RadioOption() {

        radioOpt.click();
    }

    @FindBy(how = How.XPATH, using = "input[@value = '9']")
    private WebElement checkboxOpt;

    public void CheckboxOption() {

        checkboxOpt.click();
    }

    @FindBy(how = How.NAME, using = "option[208]")
    private WebElement text;

    public void TextOption(String textToSend) {
        text.clear();
        text.sendKeys(textToSend);
    }


    @FindBy(how = How.NAME, using = "option[217]")
    public WebElement select;

    public void ClickColorSelect(){

        select.click();
    }
    Select index = new Select (select);

    public void selectColor(int i)
    {
        index.selectByIndex(i);

    }

    @FindBy(how = How.NAME, using = "option[209]")
    private WebElement textarea;

    public void TextAreaOption(String textToSend) {
        textarea.clear();
        textarea.sendKeys(textToSend);
    }
    @FindBy(how = How.ID, using = "button-upload222")
    private WebElement element;

    public void sendKeys(){
        element.sendKeys(path);

    }
    //public void clickUploadAlert() {

        //element.click();
    //}
    //alert did not found probably because of issue with file upload

    @FindBy(how = How.CLASS_NAME, using = "day active today")
    private WebElement date;

    public void SelectDate() {
        date.click();
    }

    @FindBy(how = How.CLASS_NAME, using = "btn btn-default")
    private WebElement time;

    public void SelectTime() {
        time.click();
    }

    @FindBy(how = How.XPATH, using = "//i[@class,'fa fa-calendar']")
    private WebElement dateAndTime;

    public void DateAndTime() {
        dateAndTime.click();
    }

    @FindBy(how = How.ID, using = "input-quantity")
    private WebElement quantity;

    public void EnterQuantity(String textToSend) {
        quantity.clear();
        quantity.sendKeys(textToSend);
    }
    @FindBy(how = How.ID, using = "button-cart")
    private WebElement addToCart;

    public void ClickAddToCart() {
        addToCart.click();
    }
    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cart;

    public void ClickCart() {
        cart.click();
    }
    @FindBy(how = How.LINK_TEXT, using = "Checkout")
    private WebElement checkoutButtonMain;


    public void ClickCheckoutButtonMain() {
        checkoutButtonMain.click();
    }
}





