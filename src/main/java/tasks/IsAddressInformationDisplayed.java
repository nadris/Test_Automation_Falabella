package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;
import ui.EmailInformationPageUI;

public class IsAddressInformationDisplayed {

    public static boolean modal(WebDriver driver){

        return WaitUntilElement.isPresent(driver, AddressInformationModalUI.addressInformationModal);
    }
}
