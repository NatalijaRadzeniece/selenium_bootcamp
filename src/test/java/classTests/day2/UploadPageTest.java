package classTests.day2;

import PageObject.Day_2.UploadPage;
import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadPageTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://demo.guru99.com/test/upload/");
    }

    @Test
    public void uploadFile() {
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.sendFile();
    }
}
