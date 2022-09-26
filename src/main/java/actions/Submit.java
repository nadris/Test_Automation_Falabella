package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Submit {
    public static void on(WebDriver webDriver, By locator){
        webDriver.findElement(locator).submit();
    }
}
