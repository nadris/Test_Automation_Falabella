package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.ResultSearchGoogleUI;

import java.io.IOException;

public class EnterResultingPage {

    public static void on(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "ResultingSearchGoogle");
        Click.on(driver,ResultSearchGoogleUI.resulSearch);
    }

}
