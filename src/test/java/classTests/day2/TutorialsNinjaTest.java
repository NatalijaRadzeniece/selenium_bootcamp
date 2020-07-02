package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.TutorialsNinjaPage;

public class TutorialsNinjaTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo( "http://tutorialsninja.com/demo/");
    }

    @Test
    public void checkingTutorialsNinja(){
        TutorialsNinjaPage homePage = new TutorialsNinjaPage(driver);

        homePage.clickComponents();

        homePage.clickMonitors();
    }
}
