package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.ShoppingModalUI;

import java.io.IOException;

public class ConfirmShoppingModal {

    public static void on(WebDriver driver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "ConfirmShoopingModal");
        Click.on(driver, ShoppingModalUI.watchShoppingBagButton);
    }
}
