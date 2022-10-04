package tasks;

import actions.Click;
import actions.Enter;
import actions.VisibilityOfElementLocated;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.EmailInformationPageUI;

import java.io.IOException;

public class CompleteFormEmailInformation {
    public static void add(WebDriver driver, String email) throws IOException {
        VisibilityOfElementLocated.on(driver, EmailInformationPageUI.emailInput);
        Enter.text(driver, EmailInformationPageUI.emailInput, email);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "AddEmailInformation");
        Click.on(driver, EmailInformationPageUI.continueButton);
    }
}
