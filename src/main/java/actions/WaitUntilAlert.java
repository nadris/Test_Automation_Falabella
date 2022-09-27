package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilAlert {
    public static boolean isPresent(WebDriver webDriver){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 20);
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
