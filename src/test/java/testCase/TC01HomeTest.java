package testCase;

import Page.HomePage;
import org.testng.annotations.Test;

public class TC01HomeTest extends HomePage {
    HomePage homePage = new HomePage();

    @Test
    public void clickButton() throws InterruptedException {

        homePage.clickOnElement(homePage.btnAccept);
        homePage.takeScreenShot("Home Page");
        homePage.clickOnElement(homePage.NopStationCart);
        homePage.takeScreenShot("Category");
        homePage.clickOnElement(homePage.Electronics);
        Thread.sleep(6000);
        homePage.scrollDown();
        homePage.takeScreenShot("Electronics Product");

        homePage.clickOnElement(homePage.Mattress);

        homePage.scrollDown();
        homePage.takeScreenShot("Mattress detail Page");

        homePage.clickOnElement(homePage.PlusIcon);

        homePage.clickOnElement(homePage.AddtoCart);
        homePage.takeScreenShot("After add to product in cart");




    }


}
