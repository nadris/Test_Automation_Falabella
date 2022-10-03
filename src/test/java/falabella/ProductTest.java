package falabella;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class ProductTest extends BaseTest {

    String wordToSearch = "Falabella Peru";
    String productToSearch = "PS4";
    String productNameSelected = "PS4 Acc Dualshock 4 (Cuh-Zct2u) - Midnight Blue - Latam Sony";
    @Test( priority = 1 )
    public void SearchProduct() {
        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultingPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        Assert.assertTrue(IsProductDisplayed.product(webDriver));
    }

    @Test( priority = 2 )
    public void selectProductAndDisplayModal(){

        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultingPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        Assert.assertTrue(IsShoppingModalDisplayed.modal(webDriver));
    }

    @Test( priority = 3 )
    public void confirmShoppingModal(){
        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultingPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        IsShoppingModalDisplayed.modal(webDriver);
        ConfirmShoppingModal.on(webDriver);
        Assert.assertTrue(IsPurchaseOrderDisplayed.on(webDriver));

    }

    @Test(priority = 4)
    public void verifyProductNameSelection(){

        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultingPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        IsShoppingModalDisplayed.modal(webDriver);
        ConfirmShoppingModal.on(webDriver);
        IsPurchaseOrderDisplayed.on(webDriver);
        Assert.assertTrue(IsProductSelected.verify(webDriver,productNameSelected));

    }

    @Test(priority = 5)
    public void verifyClickPurchaseOrder(){
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
        Assert.assertTrue(IsEmailInformationDisplayed.button(webDriver));

    }

}
