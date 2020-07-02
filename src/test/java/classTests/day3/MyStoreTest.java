package classTests.day3;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;

public class MyStoreTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }
}