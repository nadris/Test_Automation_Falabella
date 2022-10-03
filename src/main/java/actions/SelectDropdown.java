package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;

public class SelectDropdown {

    public static void on(WebDriver webDriver, By textLocator, String text, By clickLocator){
        VisibilityOfElementLocated.on(webDriver,textLocator);
        webDriver.findElement(textLocator).sendKeys(text);
        VisibilityOfElementLocated.on(webDriver,clickLocator);
        webDriver.findElement(clickLocator).click();
        VisibilityOfElementLocated.on(webDriver,textLocator);
    }
}
