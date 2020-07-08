package extras;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.extras.DragPage;
import pageObject.extras.InternetHeroPage;

public class DragTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(DragTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
    }

    @Test
    public void MyDragTest() {
        LOGGER.info("initializing Drag page");
        DragPage dragPage = new DragPage(driver);

        LOGGER.info("draging items 2");
        dragPage.dragElementTwo();

        LOGGER.info("draging items 4");
        dragPage.dragElementFour();


//        LOGGER.info("verify items in dropList");
//        dragPage.item();
        // not sure how to verify
    }
}

// go to https://www.seleniumeasy.com/test/drag-and-drop-demo.html
// drag 'Draggable" 2 & 4 to 'Drop here'
// verify 1 and 3 stayed from lest side and 2 & 4 on rights side