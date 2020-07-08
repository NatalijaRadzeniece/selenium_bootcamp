package pageObject.extras;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.PrimitiveIterator;

public class DragPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//span[text()='Draggable 2']")
    private WebElement dragItem2;

    @FindBy(how = How.XPATH, using = "//span[text()='Draggable 4']")
    private WebElement dragItem4;

    @FindBy(how = How.XPATH, using = "//span[text()='Draggable 1']")
    private WebElement dragItem1;

    @FindBy(how = How.XPATH, using = "//span[text()='Draggable 3']")
    private WebElement dragItem3;

    @FindBy(how = How.ID, using = "mydropzone")
    private WebElement dropZone;

    @FindBy(how = How.ID, using = "droppedlist")
    private WebElement dropList;

    public DragPage(WebDriver driver) {
        super(driver);
    }

    public void dragElementTwo(){
        Actions act = new Actions(driver);
        act.dragAndDrop(dragItem2, dropZone).build().perform();
    }

    public void dragElementFour() {
        Actions act = new Actions(driver);
        act.dragAndDrop(dragItem4, dropZone).build().perform();
    }

    public String itemsInDropList(){
        waitForTheElement(dragItem2);
        return dropList.getText();
    }

    public void item(){
        System.out.println(dropList.getText());
    }

}
