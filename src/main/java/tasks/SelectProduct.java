package tasks;

import actions.Click;
import actions.MoveToElement;
import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.ProductsPageUI;

public class SelectProduct {

    public static void as(WebDriver driver){
        MoveToElement.on(driver, ProductsPageUI.addProductButton);
        Click.on(driver,ProductsPageUI.addProductButton);
    }
}
