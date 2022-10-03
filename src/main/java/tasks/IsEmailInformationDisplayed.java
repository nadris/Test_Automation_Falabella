package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.EmailInformationPageUI;

public class IsEmailInformationDisplayed {

    public static boolean button(WebDriver driver){
        return WaitUntilElement.isPresent(driver, EmailInformationPageUI.continueButton);
    }
}
