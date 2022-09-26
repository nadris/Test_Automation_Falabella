package tasks;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class IsHomePageDisplayed {

    public static boolean corousel (WebDriver webDriver) {
        return IsDisplayed.element(webDriver, HomePageUI.mainCarousel);
    }
}
