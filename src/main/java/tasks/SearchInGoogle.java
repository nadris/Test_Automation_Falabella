package tasks;

import actions.Enter;
import actions.Submit;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.SearchGoogleUI;

import java.io.IOException;

public class SearchInGoogle {

    public static void as(WebDriver driver, String textSearch) throws IOException {

        Enter.text(driver, SearchGoogleUI.searchInput, textSearch);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "SearchInGoogle");
        Submit.on(driver, SearchGoogleUI.searchInput);
    }
}
