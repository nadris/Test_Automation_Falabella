package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;

public class SelectDropdown {

    public static void on(WebDriver webDriver, By locator, String text){

        webDriver.findElement(locator).sendKeys(text, Keys.DOWN);
        VisibilityOfElementLocated.on(webDriver,locator);

    }
}
