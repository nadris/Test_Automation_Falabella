package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.ShoppingModalUI;

public class ConfirmShoppingModal {

    public static void on(WebDriver driver){
        Click.on(driver, ShoppingModalUI.watchShoppingBagButton);
    }
}
