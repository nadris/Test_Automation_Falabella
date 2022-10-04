package tasks;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.ProductsPageUI;

import java.io.IOException;

public class SearchProduct {

    public static void as(WebDriver driver, String product ) throws IOException {
        Enter.text(driver, HomePageUI.searchInput, product);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "SearchProduct");
        Click.on(driver, HomePageUI.searchButton);
    }
}
