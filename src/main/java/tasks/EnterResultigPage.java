package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.ResultSearchGoogleUI;

public class EnterResultigPage {

    public static void on(WebDriver driver){
        Click.on(driver,ResultSearchGoogleUI.resulSearch);
    }

}
