package Page;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public By btnAccept = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept");
    public By NopStationCart = By.xpath("//android.widget.ImageButton[@content-desc=\"NopStation Cart\"]");
    public By Electronics = By.xpath("(//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvName\"])[7]");
    public By Mattress = By.xpath("(//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvProductName\"])[12]");
    public By PlusIcon = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnPlus\"]");
    public By AddtoCart = By.xpath("//android.widget.Button[@text=\"ADD TO CART\"]");
}
