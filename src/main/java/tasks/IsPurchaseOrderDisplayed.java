package tasks;

import actions.IsDisplayed;
import actions.WaitUntilAlert;
import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.PurchaseOrderPageUI;

import java.io.IOException;

public class IsPurchaseOrderDisplayed {

    public static boolean on(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "IsPurchaseOrderDisplayed");
        return WaitUntilElement.isPresent(driver, PurchaseOrderPageUI.buyButton);

    }
}
