package tasks;

import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.EmailInformationPageUI;

import java.io.IOException;

public class IsEmailInformationDisplayed {

    public static boolean button(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "IsEmailInformationDisplayed");
        return WaitUntilElement.isPresent(driver, EmailInformationPageUI.continueButton);
    }
}
