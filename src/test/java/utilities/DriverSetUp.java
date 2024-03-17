package utilities;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverSetUp {


    private static final ThreadLocal<AndroidDriver> LOCAL_DRIVER = new ThreadLocal<>();

    public static void setDriver(AndroidDriver driver) {
        LOCAL_DRIVER.set(driver);
    }

    public static AndroidDriver getDriver() {
        return LOCAL_DRIVER.get();
    }

    @BeforeSuite
    public void driverSetup() throws MalformedURLException {
        File f = new File("src");
        File fs = new File(f, "nopstationCart_4.40 1.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "pixel");
        cap.setCapability("app", fs.getAbsolutePath());

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        setDriver(driver);
    }

    @AfterSuite
    public void quitDriver() {
        getDriver().removeApp("com.nopstation.nopcommerce.nopstationcart");
        getDriver().quit();
    }
}
