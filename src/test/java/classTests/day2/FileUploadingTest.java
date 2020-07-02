package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.UploadPage;

public class FileUploadingTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://demo.guru99.com/test/upload/");
    }
    @Test
    public void uploadFile(){
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.sendFile();

    }
}
