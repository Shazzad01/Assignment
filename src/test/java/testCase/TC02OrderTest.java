package testCase;

import Page.OrderPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.DriverSetUp;
import utilities.ExcelReader;

public class TC02OrderTest extends DriverSetUp {
    OrderPage orderPage = new OrderPage();

    @DataProvider(name = "orderData")
    public Object[][] getOrderData() {
        String filePath = "C:\\Users\\User\\Documents\\testdata.xlsx";
        String sheetName = "Sheet1";
        return ExcelReader.readTestData(filePath, sheetName);
    }

    @Test(dataProvider = "orderData")
    public void placeOrderAsaGuestUser(String firstName, String lastName, String email, String company, String city, String streetAddress1, String streetAddress2, String zipCode, String phoneNumber, String faxNumber) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();


        orderPage.clickOnElement(orderPage.shoppingCart);
        orderPage.clickOnElement(orderPage.checkoutButton);
        orderPage.clickOnElement(orderPage.checkoutAsGuest);
        orderPage.writeOnByLocator(orderPage.firstNameField, firstName);
        orderPage.writeOnByLocator(orderPage.lastNameField, lastName);
        orderPage.writeOnByLocator(orderPage.emailField, email);
        orderPage.clickOnElement(orderPage.selectCountry);
        orderPage.scrollToElement01("Bangladesh");
        orderPage.clickOnElement(orderPage.Bangladesh);
        orderPage.clickOnElement(orderPage.selectState);
        orderPage.scrollToElement01("টাঙ্গাইল");
        orderPage.clickOnElement(orderPage.Tangail);
        orderPage.writeOnByLocator(orderPage.companyField, company);
        orderPage.writeOnByLocator(orderPage.cityField, city);
        orderPage.writeOnByLocator(orderPage.streetAddressField, streetAddress1);
        orderPage.writeOnByLocator(orderPage.streetAddress2Field, streetAddress2);
        orderPage.writeOnByLocator(orderPage.zipCodeField, zipCode);
        orderPage.scrollDown();
        orderPage.writeOnByLocator(orderPage.phoneNumberField, phoneNumber);
        orderPage.writeOnByLocator(orderPage.faxNumberField, faxNumber);
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
        softAssert.assertEquals(orderPage.getElementText(orderPage.popUpMessage), "Your order has been successfully processed!\n" +
                "Order Number: 6447");


    }
}
