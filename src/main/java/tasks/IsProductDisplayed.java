package tasks;

import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.ProductsPageUI;

public class IsProductDisplayed {

    public static boolean product(WebDriver driver) {
        return WaitUntilElement.isPresent(driver, ProductsPageUI.product);
    }
}