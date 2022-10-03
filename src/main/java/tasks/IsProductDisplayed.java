package tasks;

import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.ProductsPageUI;

public class IsProductDisplayed {

    public static boolean product(WebDriver webDriver) {
        return WaitUntilElement.isPresent(webDriver, ProductsPageUI.product);
    }
}