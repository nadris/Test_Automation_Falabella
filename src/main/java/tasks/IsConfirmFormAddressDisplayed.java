package tasks;

import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;
import ui.ConfirmAddressModalUI;

import java.io.IOException;

public class IsConfirmFormAddressDisplayed {

    public static boolean modal(WebDriver driver) throws IOException, InterruptedException {
        Thread.sleep(5000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "IsConfirmFormAddressDisplayed");
        return WaitUntilElement.isPresent(driver, ConfirmAddressModalUI.saveButton);

    }
}
