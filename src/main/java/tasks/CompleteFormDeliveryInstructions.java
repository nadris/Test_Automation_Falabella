package tasks;

import actions.Click;
import actions.Selected;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.DeliveryInstructionsPageUI;

public class CompleteFormDeliveryInstructions {
    public static void add(WebDriver driver, String departament, String city, String neighborhood){
        Selected.on(driver, DeliveryInstructionsPageUI.departamentInput,departament);
        Selected.on(driver, DeliveryInstructionsPageUI.cityInput,city);
        Selected.on(driver, DeliveryInstructionsPageUI.neighborhoodInput,neighborhood);
        /*WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.(DeliveryInstructionsPageUI.continueButton));*/
        Thread.sleep(2000);
        Click.on(driver,DeliveryInstructionsPageUI.continueButton);
    }
}
