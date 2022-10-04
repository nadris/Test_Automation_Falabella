package tasks;

import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.ShoppingModalUI;

import java.io.IOException;

public class IsShoppingModalDisplayed {

    public static boolean modal(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "IsShoppingModalDisplayed");
        return WaitUntilElement.isPresent(driver, ShoppingModalUI.shoppingModal);
    }
}
