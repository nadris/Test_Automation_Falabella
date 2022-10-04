package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.PurchaseOrderPageUI;

import java.io.IOException;

public class ClickPurchaseOrder {
    public static void on(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "ClicPurchaseOrder");
        Click.on(driver, PurchaseOrderPageUI.buyButton);
    }

}
