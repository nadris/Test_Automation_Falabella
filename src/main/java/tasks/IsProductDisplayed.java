package tasks;

import actions.IsDisplayed;
import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.ProductsPageUI;

import java.io.IOException;

public class IsProductDisplayed {

    public static boolean product(WebDriver webDriver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "IsProductDisplayed");
        return WaitUntilElement.isPresent(webDriver, ProductsPageUI.product);
    }
}