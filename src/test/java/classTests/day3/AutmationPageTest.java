package classTests.day3;


import PageObject.Day_3.*;
import baseWebTest.BaseWebTest;
import model.AutomationPracticePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutmationPageTest extends BaseWebTest {


    @BeforeClass
    public void navigateTo() {

        navigateTo("http://automationpractice.com/index.php");

    }

    @Test
    public void AutomationPageTest () {


        AutomationHomePage homePage = new AutomationHomePage(driver);
        homePage.ClickWomenbutton();
        WomenPage womenPage = new WomenPage(driver);
        AutomationPracticePage items = womenPage.SelectItem(1);
        FirstItemPage firstItemPage = new FirstItemPage(driver);
        firstItemPage.ClickAddtoCartButton();
        ProceedToCheckoutPage proceedToCheckoutPage = new ProceedToCheckoutPage(driver);
        proceedToCheckoutPage.ClickProceedToCheckout();
        ShoppingCart shoppingCart = new ShoppingCart(driver);
        shoppingCart.ClickGoToShopping();
        AutomationPracticePage item = womenPage.SelectItem(2);
        firstItemPage.ClickAddtoCartButton();
        proceedToCheckoutPage.ClickProceedToCheckout();
        MyShoppingCart myShoppingCart = new MyShoppingCart(driver);
        myShoppingCart.ClickToShoppingCart();

    }



        //copy of our object model - Article.java.
        //that in Test class created Object model is actually one from Page class (DelfiHomePage)
    }

