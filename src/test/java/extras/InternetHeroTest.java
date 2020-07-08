package extras;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.extras.*;

public class InternetHeroTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(InternetHeroTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/");
    }

    @Test
    public void HoversTest() {
        LOGGER.info("initializing Internet Hero page and clicking on Hovers");
        InternetHeroPage internetHeroPage = new InternetHeroPage(driver);
        internetHeroPage.clickHovers();

        LOGGER.info("initializing Hovers page and click view profile");
        HoversPage hoversPage = new HoversPage(driver);
        hoversPage.clickViewProfile();

        LOGGER.info("confirm 'not found' appeared");
        UserPage userPage = new UserPage(driver);
        Assertions.assertEquals("Not Found", userPage.notFoundMessage(), "Text not the same");
    }

    @Test
    public void DynamicControlsTest() {
        LOGGER.info("initializing Internet Hero page and clicking on Dynamic Controls");
        InternetHeroPage internetHeroPage = new InternetHeroPage(driver);
        internetHeroPage.clickDynamicControls();

        LOGGER.info("initializing Dynamic controls page and checking 'A checkbox'");
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.markCheckbox();

        LOGGER.info("clicking Remove");
        dynamicControlsPage.clickRemove();

        LOGGER.info("verify remove button 'It's gone!'");
        Assertions.assertEquals("It's gone!", dynamicControlsPage.verifyDestroy(), "message not the same");

        LOGGER.info("click 'Enable'");
        dynamicControlsPage.clickEnableButton();
        LOGGER.info("add text to field");
        dynamicControlsPage.writeInBox("Hey You!");
        LOGGER.info("press 'Disable'");
        dynamicControlsPage.clickDisableButton();

        LOGGER.info("verify that text field is disabled");
        dynamicControlsPage.verifyTextFieldIsDisabled();
        dynamicControlsPage.verifyTextFieldIsDisabledTwo();
    }

    @Test
    // could not figure out how to catch that message (tried various options)
    public void KeyPresesTest() {
        LOGGER.info("initializing Internet Hero page and clicking on Key Presses");
        InternetHeroPage internetHeroPage = new InternetHeroPage(driver);
        internetHeroPage.clickKeyPresses();

        LOGGER.info("initializing Key presses page");
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver);
        keyPressesPage.enterInputField();

        LOGGER.info("press Enter and verify");
        keyPressesPage.enterInputField();
        Assertions.assertEquals("You entered: ENTER", keyPressesPage.keyPressed(), "text not the same");

        LOGGER.info("press Tab and verify");
        keyPressesPage.tabInputField();
        Assertions.assertEquals("You entered: TAB", keyPressesPage.keyPressed(), "text not the same");

        LOGGER.info("press Up and verify");
        keyPressesPage.upInputField();
        Assertions.assertEquals("You entered: UP", keyPressesPage.keyPressed(), "text not the same");

        LOGGER.info("press Down and verify");
        keyPressesPage.downInputField();
        Assertions.assertEquals("You entered: ENTER", keyPressesPage.keyPressed(), "text not the same");
    }
}