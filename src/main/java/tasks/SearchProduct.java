package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.ProductsPageUI;

public class SearchProduct {

    public static void as(WebDriver driver, String product ){
        Enter.text(driver, ProductsPageUI.searchInput, product);
        Click.on(driver, ProductsPageUI.searchButton);
    }
}
