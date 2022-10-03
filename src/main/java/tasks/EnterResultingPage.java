package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.ResultSearchGoogleUI;

public class EnterResultingPage {

    public static void on(WebDriver driver){
        Click.on(driver,ResultSearchGoogleUI.resulSearch);
    }

}
