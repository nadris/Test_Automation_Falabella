package falabella;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

import java.io.IOException;

public class OrderDeliveryTest extends BaseTest {
    String wordToSearch = "Falabella Peru";
    String productToSearch = "PS4";

    @Test(priority = 1)
    public void emailInformationCompleted() throws IOException, InterruptedException {
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
        IsAddressInformationDisplayed.modal(webDriver);
        CompleteFormAddressInformation.add(webDriver,"AREQUIPA","AREQUIPA","AREQUIPA","CALLE 7","683","PISO 2");
        Assert.assertTrue(true);
    }

}
