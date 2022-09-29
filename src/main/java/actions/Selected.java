package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Selected {
    public static void on(WebDriver webDriver, By locator, String searchText){

        Select select = new Select(webDriver.findElement(locator));
        select.selectByVisibleText(searchText);

    }
}
