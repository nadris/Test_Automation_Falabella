package tasks;

import actions.Click;
import actions.MoveToElement;
import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.ProductsPageUI;

import java.io.IOException;

public class SelectProduct {

    public static void as(WebDriver driver) throws IOException {
        MoveToElement.on(driver, ProductsPageUI.addProductButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "SelectProduct");
        Click.on(driver,ProductsPageUI.addProductButton);
    }
}
