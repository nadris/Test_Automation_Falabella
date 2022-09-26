package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.ResultSearchGoogleUI;

public class IsValidSearch {

    public static boolean validSearch(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, ResultSearchGoogleUI.resulSearch);

    }
}
