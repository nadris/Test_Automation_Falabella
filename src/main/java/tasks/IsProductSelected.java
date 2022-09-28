package tasks;

import actions.GetValue;
import org.openqa.selenium.WebDriver;
import ui.PurchaseOrderPageUI;

public class IsProductSelected {
    public static boolean verify(WebDriver driver, String productName){

        if(GetValue.from(driver, PurchaseOrderPageUI.productNameSelected).equals(productName)){
            return true;
        }
        return false;
    }
}
