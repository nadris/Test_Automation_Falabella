package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetValue {

    public static String value(WebDriver webDriver, By locator){
        return webDriver.findElement(locator).getText();
    }
}
