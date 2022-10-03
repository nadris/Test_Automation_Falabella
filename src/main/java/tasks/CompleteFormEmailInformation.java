package tasks;

import actions.Click;
import actions.Enter;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.EmailInformationPageUI;

public class CompleteFormEmailInformation {

    public static void add(WebDriver driver, String email){
        VisibilityOfElementLocated.on(driver, EmailInformationPageUI.emailInput);
        Enter.text(driver, EmailInformationPageUI.emailInput, email);
        Click.on(driver, EmailInformationPageUI.continueButton);
    }
}
