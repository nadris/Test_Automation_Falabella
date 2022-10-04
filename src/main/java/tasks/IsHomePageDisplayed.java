package tasks;

import actions.IsDisplayed;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

import java.io.IOException;

public class IsHomePageDisplayed {

    public static boolean corousel (WebDriver webDriver) throws IOException {
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "DisplayCorousel");
        return IsDisplayed.element(webDriver, HomePageUI.mainCarousel);
    }
}
