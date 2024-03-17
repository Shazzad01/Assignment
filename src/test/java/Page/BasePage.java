package Page;

import com.google.gson.annotations.Until;
import io.appium.java_client.AppiumBy;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.DriverSetUp;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.ByteArrayInputStream;

public class BasePage extends DriverSetUp {
    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);

    }

    public void clickOnElement(By locator) {
        getElement(locator).click();

    }

    public void writeOnByLocator(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public void selectItemByIndex(By locator, int index) {
        WebElement element = getDriver().findElement(locator);
        Select selectItems = new Select(element);
        selectItems.selectByIndex(index);
    }

    public void selectItemByVisibleText(By locator, String value) {
        WebElement element = getDriver().findElement(locator);
        Select selectItems = new Select(element);
        selectItems.selectByVisibleText(value);
    }


    public void scrollDown() {

        Dimension size = getDriver().manage().window().getSize();
        int startX = size.getWidth() / 2;
        int endX = size.getWidth() / 2;

        int startY = (int) (size.getHeight() * 0.50);
        int endY = (int) (size.getHeight() * 0.10);

        TouchAction touchAction = new TouchAction(getDriver()).press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(endX, endY)).release().perform();

    }

    public void scrollToElement(String ele) {
        getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new  UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ele\").instance(0))"));
    }

    public void scrollToElement01(String ele) {
        String scrollableLocator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
        String elementLocator = String.format(".scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))", ele);
        String fullLocator = scrollableLocator + elementLocator;

        getDriver().findElement(AppiumBy.androidUIAutomator(fullLocator));
    }


    public void takeScreenShot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) (getDriver())).getScreenshotAs(OutputType.BYTES)));
    }


}
