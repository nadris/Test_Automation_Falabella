package tasks;

import actions.GetValue;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.PurchaseOrderPageUI;

import java.io.IOException;

public class IsProductSelected {
    public static boolean verify(WebDriver driver, String productName) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "isProductSelectVerify");
        if(GetValue.from(driver, PurchaseOrderPageUI.productNameSelected).equals(productName)){
            return true;
        }
        return false;
    }
}
