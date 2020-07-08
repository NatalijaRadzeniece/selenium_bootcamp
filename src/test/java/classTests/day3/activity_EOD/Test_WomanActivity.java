package classTests.day3.activity_EOD;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.SystemPropertiesPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.activity_EOD.BuyShirt;
import pageObject.day3.activity_EOD.HomePage;
import pageObject.day3.activity_EOD.WomenPage;

public class Test_WomanActivity extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(Test_WomanActivity.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void Test_WomanActivity() throws InterruptedException {
        HomePage HomePage = new HomePage(driver);
        HomePage.clickingOnWoman();
        Thread.sleep(3000);
        WomenPage WomenPage = new WomenPage(driver);
        WomenPage.clickOnPic();
        Thread.sleep(3000);

        BuyShirt BuyShirt = new BuyShirt(driver);
        Thread.sleep(1600);
        //String priceShirt = BuyShirt.getPrice();
        BuyShirt.addToCard();
        Thread.sleep(3000);





    }
}
