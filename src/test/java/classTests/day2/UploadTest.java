package classTests.day2;

import baseWebTest.BaseWebTest;
import core.BaseFunc;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadTest extends BaseWebTest {
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
