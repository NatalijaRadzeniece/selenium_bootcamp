//package classTests.day2;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import java.util.List;
//
//public class ReturnMethodsSamples {
//
//    @FindBy(how = How.ID, using = "element")
//    private WebElement webElement;
//
//
//    // Returning method good to use if you need specific information from test, like text from element to assert it.
//    // we can return anything  - String, Integer, List, Object and etc.
//    // to return right type of value after "public" should go type of it.
//
//    //will return string, can be done alse with element.getAttribute("attributeName") and .getCssValue("name of CSS")
//    public String getTextOfElement() {
//        return webElement.getText();
//    }
//
//
//    //will return List of elemets, which located under same locator.
//    //also can be List<String>, and a lot more
//    public List<WebElement> getListOfElements() {
//        return driver.findElements(By locator);
//    }
//
//    //with PageFactory we can get list of elements already on "@FindBy"
//    @FindBy(how = How.ID, using = "element")
//    private List<WebElement> elements;
//
//
//}
