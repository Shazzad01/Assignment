package Page;

import org.openqa.selenium.By;

public class OrderPage extends BasePage {

    public By shoppingCart = By.xpath("//android.widget.ImageView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/counterIcon\"]");
    public By checkoutButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut\"]");
    public By checkoutAsGuest = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout\"]");
    public By firstNameField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFirstName\"]");
    public By lastNameField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etLastName\"]");
    public By emailField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEmail\"]");
    public By selectCountry = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/countrySpinner\"]");
    public By companyField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCompanyName\"]");
    public By cityField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCity\"]");
    public By streetAddressField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress\"]");
    public By streetAddress2Field = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2\"]");
    public By zipCodeField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etZipCode\"]");
    public By phoneNumberField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etPhone\"]");
    public By faxNumberField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFax\"]");
    public By selectState = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]");
    public By continueButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"]");
    public By shippingMethod = By.xpath("(//android.widget.TextView[@text=\"Next Day Air\"])[1]");
    public By paymentMethod = By.xpath("(//android.widget.TextView[@text=\"Pay by cheque or money order\"])");
    public By nextButton = By.xpath("//android.widget.Button[@text=\"Next\"]");

    public By confirmButton = By.xpath("//android.widget.Button[@text=\"CONTINUE\"]");
    public By popUpMessage = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_text_message\"]");
    public By Bangladesh = By.xpath("(//android.widget.TextView[@text=\"Bangladesh\"])[1]");
    public By Tangail = By.xpath("(//android.widget.TextView[@text=\"টাঙ্গাইল\"])");
    public By continueButton01 = By.xpath("(//android.widget.Button[@text=\"CONTINUE\"])[2]");
    public By continueButton02 = By.xpath("(//android.widget.Button[@text=\"CONTINUE\"])[2]");




}
