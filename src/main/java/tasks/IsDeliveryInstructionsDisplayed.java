package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DeliveryInstructionsPageUI;

public class IsDeliveryInstructionsDisplayed {

    public static boolean form(WebDriver driver){
        return WaitUntilElement.isPresent(driver, DeliveryInstructionsPageUI.formInstructions);
    }
}
