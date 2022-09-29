package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DeliveryAddressPageUI;

public class IsDeliveryAddressDisplayed {

    public static boolean on(WebDriver driver){
        return WaitUntilElement.isPresent(driver, DeliveryAddressPageUI.formAddress);
    }
}
