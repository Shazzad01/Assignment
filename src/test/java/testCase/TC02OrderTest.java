package testCase;

import Page.OrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetUp;
import utilities.ExcelReader;

public class TC02OrderTest extends DriverSetUp {
    OrderPage orderPage = new OrderPage();
    ExcelReader excelReader = new ExcelReader();
    @Test
    public void placeOrderAsaGuestUser() throws InterruptedException {
        String[] testData = ExcelReader.readTestData();

        orderPage.clickOnElement(orderPage.shoppingCart);
        orderPage.clickOnElement(orderPage.checkoutButton);
        orderPage.clickOnElement(orderPage.checkoutAsGuest);
        orderPage.writeOnByLocator(orderPage.firstNameField,testData[0]);
        orderPage.writeOnByLocator(orderPage.lastNameField,testData[1]);
        orderPage.writeOnByLocator(orderPage.emailField,testData[2]);
        orderPage.clickOnElement(orderPage.selectCountry);
        orderPage.scrollToElement01("Bangladesh");
        orderPage.clickOnElement(orderPage.Bangladesh);
        orderPage.clickOnElement(orderPage.selectState);
        orderPage.scrollToElement01("টাঙ্গাইল");
        orderPage.clickOnElement(orderPage.Tangail);
        orderPage.writeOnByLocator(orderPage.companyField,testData[3]);
        orderPage.writeOnByLocator(orderPage.cityField,testData[4]);
        orderPage.writeOnByLocator(orderPage.streetAddressField,testData[5]);
        orderPage.writeOnByLocator(orderPage.streetAddress2Field,testData[6]);
        orderPage.writeOnByLocator(orderPage.zipCodeField,testData[7]);
        orderPage.scrollDown();
        orderPage.writeOnByLocator(orderPage.phoneNumberField,testData[8]);
        orderPage.writeOnByLocator(orderPage.faxNumberField,testData[9]);
        orderPage.takeScreenShot("billing information");
        orderPage.clickOnElement(orderPage.continueButton);
        orderPage.clickOnElement(orderPage.shippingMethod);
        orderPage.takeScreenShot("Shipping method select");
        orderPage.clickOnElement(orderPage.continueButton01);
        Thread.sleep(6000);
        orderPage.scrollDown();
        orderPage.scrollDown();
        orderPage.scrollDown();
        Thread.sleep(6000);
        orderPage.clickOnElement(orderPage.paymentMethod);
        orderPage.takeScreenShot("Payment method select");
        orderPage.scrollDown();
        Thread.sleep(2000);
        orderPage.clickOnElement(orderPage.continueButton02);
        Thread.sleep(6000);
        orderPage.clickOnElement(orderPage.nextButton);
        Thread.sleep(6000);
        orderPage.clickOnElement(orderPage.confirmButton);
        Thread.sleep(6000);
        orderPage.takeScreenShot("Order Conformation message");
        Assert.assertEquals(orderPage.getElementText(orderPage.popUpMessage),"Your order has been successfully processed!\n" +
                "Order Number: 6412");



    }
}
