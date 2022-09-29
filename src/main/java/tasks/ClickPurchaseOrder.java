package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.PurchaseOrderPageUI;

public class ClickPurchaseOrder {
    public static void on(WebDriver driver){
        Click.on(driver, PurchaseOrderPageUI.buyButton);
    }

}
