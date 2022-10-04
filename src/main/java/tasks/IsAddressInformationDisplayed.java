package tasks;

import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;
import ui.EmailInformationPageUI;

import java.io.IOException;

public class IsAddressInformationDisplayed {

    public static boolean modal(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "IsAddressInformation");
        return WaitUntilElement.isPresent(driver, AddressInformationModalUI.addressInformationModal);
    }
}
