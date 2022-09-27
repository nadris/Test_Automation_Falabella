package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.ShoppingModalUI;

public class IsShoppingModalDisplayed {

    public static boolean modal(WebDriver driver){
        return WaitUntilElement.isPresent(driver, ShoppingModalUI.shoppingModal);
    }
}
