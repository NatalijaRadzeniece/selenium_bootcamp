package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomepage;
import pageObject.day2.UploadPage;

public class DelfiTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void checkingDelfi() {
        DelfiHomepage delfiHomepage = new DelfiHomepage(driver);
//        delfiHomepage.selectMenuItems("Ārzemēs");

        delfiHomepage.clickArticle(5);
    }
}
