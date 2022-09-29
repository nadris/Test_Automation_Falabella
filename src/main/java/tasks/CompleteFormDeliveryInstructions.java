package tasks;

import actions.Click;
import actions.Selected;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.DeliveryInstructionsPageUI;

import java.util.concurrent.TimeUnit;

public class CompleteFormDeliveryInstructions {
    public static void add(WebDriver driver, String departament, String city, String neighborhood){
        Selected.on(driver, DeliveryInstructionsPageUI.departamentInput,departament);
        Selected.on(driver, DeliveryInstructionsPageUI.cityInput,city);
        Selected.on(driver, DeliveryInstructionsPageUI.neighborhoodInput,neighborhood);
        VisibilityOfElementLocated.on(driver,DeliveryInstructionsPageUI.continueButton);
        Click.on(driver,DeliveryInstructionsPageUI.continueButton);
    }
}
