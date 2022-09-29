package falabella;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class OrderDeliveryTest extends BaseTest {
    String wordToSearch = "Falabella Colombia";
    String productToSearch = "PS5";

    @Test(priority = 1)
    public void completedFormDeliveryInstructions (){
        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        ConfirmShoppingModal.on(webDriver);
        IsPurchaseOrderDisplayed.on(webDriver);
        ClickPurchaseOrder.on(webDriver);
        IsDeliveryInstructionsDisplayed.form(webDriver);
        CompleteFormDeliveryInstructions.add(webDriver,"ANTIOQUIA","ANZA","ANZA");
        Assert.assertTrue(IsDeliveryAddressDisplayed.on(webDriver));
    }

}
