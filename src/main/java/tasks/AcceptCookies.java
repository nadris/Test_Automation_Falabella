package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.PurchaseOrderPageUI;

public class AcceptCookies {
    public static void on(WebDriver driver){
        Click.on(driver, HomePageUI.acceptCookieButton);
    }

}
