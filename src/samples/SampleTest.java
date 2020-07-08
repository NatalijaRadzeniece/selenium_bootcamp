package samplesTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import baseWebTest.BaseWebTest;
import samplesPages.PageFactorySamplePage;

//Extends base Test class
public class SampleTest extends BaseWebTest {


    //Annotation @BeforeClass will be run before all activitiesTests.
    //in this case we navigating to website
    @BeforeClass
    public void defineDriver() {

        navigateTo("url to website");
    }

    //@Test used for test method
    //Might be multiple test methods in one Test Class, but today most common to use 1 test class for 1 test method.
    @Test
    public void sampleTest() {
        //here we initializing page to use methods from it
        PageFactorySamplePage pageFactory = new PageFactorySamplePage(driver);

        //this is how we use method from page object class
        pageFactory.clickElement();

        //print out page Title
        System.out.println(driver.getTitle());

        //print out page URL
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void sampleTest2() {
        //here we initializing page to use methods from it
        PageFactorySamplePage pageFactory = new PageFactorySamplePage(driver);

        //this is how we use method from page object class
        pageFactory.clickElement();

        //print out page Title
        System.out.println(driver.getTitle());

        //print out page URL
        System.out.println(driver.getCurrentUrl());

    }

    // After full class ( which means after all activitiesTests in this class will be finished) will be executed this method
    @AfterClass
    public void closeBrowser() {
        //close browser
        driver.close();
    }


}
