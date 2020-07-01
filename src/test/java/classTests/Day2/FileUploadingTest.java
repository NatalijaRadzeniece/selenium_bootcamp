package classTests.Day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Day2.UploadPage;

public class FileUploadingTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("");
    }
    @Test
    public void uploadFile(){
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.setFile();
    }
}
