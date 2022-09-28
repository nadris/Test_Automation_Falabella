package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetValue {

    public static String from(WebDriver webDriver, By locator){
        return webDriver.findElement(locator).getText();
    }
}
