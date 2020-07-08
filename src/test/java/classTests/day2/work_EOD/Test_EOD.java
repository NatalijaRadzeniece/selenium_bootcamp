package classTests.day2.work_EOD;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.work_EOD.AppleCinemaPage;
import pageObject.day2.work_EOD.CheckoutPage;
import pageObject.day2.work_EOD.HomePage;
import pageObject.day2.work_EOD.MonitorPage;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class Test_EOD extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(Test_EOD.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void Test_EOD() throws InterruptedException {

        LOGGER.info("Test starting!");
        HomePage HomePage = new HomePage(driver);
        HomePage.clickComponentMenu();
        HomePage.clickMonitorDrop();

        LOGGER.info("Go to Monitor Page!");
        MonitorPage MonitorPage = new MonitorPage(driver);
        MonitorPage.clickAddCart();

        LOGGER.info("Go to Apple Cinema Page!");
        AppleCinemaPage AppleCinemaPage = new AppleCinemaPage(driver);
        Thread.sleep(5000);
        AppleCinemaPage.clickRad();
        AppleCinemaPage.clickCheck();
        AppleCinemaPage.inputText("Some text");
        AppleCinemaPage.chooseColor();
        AppleCinemaPage.inputTextArena("Kkkasd asas");
        AppleCinemaPage.setFile();
        AppleCinemaPage.setDate("2011-02-03");
        AppleCinemaPage.setTime("22:25");
        AppleCinemaPage.setDateAndTime("2011-02-03","22:25");
        AppleCinemaPage.setQuant("2");
        AppleCinemaPage.clickAddCart();
        AppleCinemaPage.clickCart();
        AppleCinemaPage.clickCheckout();

        LOGGER.info("Checkout!");
        CheckoutPage CheckoutPage = new CheckoutPage(driver);
        Thread.sleep(2000);
        CheckoutPage.ChooseGuest();
        CheckoutPage.contClick();
        Thread.sleep(2000);
        CheckoutPage.inputBillingDetalis("Janis","Kalnins","Kalnins@inbox.lv","332432","Iela 2","Riga","LV-3322");
        CheckoutPage.chooseCountry();
        CheckoutPage.chooseRegion();
        Thread.sleep(2000);
        CheckoutPage.continueclicking2();
        Thread.sleep(2000);
        CheckoutPage.continueclicking3();
        Thread.sleep(1400);
        CheckoutPage.acceptinTermsCond();
        Thread.sleep(1600);
        CheckoutPage.continueClicking4();
        Thread.sleep(1600);
        CheckoutPage.continueClicking5();
        Thread.sleep(1600);
        String a;
        a = CheckoutPage.getSuccessText();
       //System.out.println(a);
        LOGGER.info(a);


        //Thread.sleep(5000);

    }


}

