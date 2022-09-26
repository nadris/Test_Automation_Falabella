package tasks;

import actions.Enter;
import actions.Submit;
import org.openqa.selenium.WebDriver;
import ui.SearchGoogleUI;

public class SearchInGoogle {

    public static void as(WebDriver driver, String textSearch){
        Enter.text(driver, SearchGoogleUI.searchInput, textSearch);
        Submit.on(driver, SearchGoogleUI.searchInput);
    }
}
