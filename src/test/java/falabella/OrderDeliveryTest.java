package falabella;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class OrderDeliveryTest extends BaseTest {
    String wordToSearch = "Falabella Peru";
    String productToSearch = "PS4";

    String productNameSelected = "PS4 Acc Dualshock 4 (Cuh-Zct2u) - Midnight Blue - Latam Sony";

    @Test(priority = 1)
    public void emailInformationCompleted(){
        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultingPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        AcceptCookies.on(webDriver);
        SelectProduct.as(webDriver);
        IsShoppingModalDisplayed.modal(webDriver);
        ConfirmShoppingModal.on(webDriver);
        IsPurchaseOrderDisplayed.on(webDriver);
        ClickPurchaseOrder.on(webDriver);
        IsEmailInformationDisplayed.button(webDriver);
        CompleteFormEmailInformation.add(webDriver, "automation2022@gmail.com");
        Assert.assertTrue(IsAddressInformationDisplayed.modal(webDriver));
        CompleteFormAddressInformation.add(webDriver,"AMAZONAS","BAGUA","ARAMANGO","CALLE 7","683","PISO 2");
    }

}
