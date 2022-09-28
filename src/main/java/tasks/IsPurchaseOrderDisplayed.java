package tasks;

import actions.IsDisplayed;
import actions.WaitUntilAlert;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.PurchaseOrderPageUI;

public class IsPurchaseOrderDisplayed {

    public static boolean on(WebDriver driver){

        return WaitUntilElement.isPresent(driver, PurchaseOrderPageUI.buyButton);

    }
}
