package falabella;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;
import ui.ShoppingModalUI;

public class ProductTest extends BaseTest {

    String wordToSearch = "Falabella Colombia";
    String productToSearch = "PS5";
    @Test( priority = 1 )
    public void SearchProduct() {

        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        Assert.assertTrue(IsProductDisplayed.product(webDriver));
    }

    @Test( priority = 2 )
    public void selectProductAndDisplayModal(){

        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        Assert.assertTrue(IsShoppingModalDisplayed.modal(webDriver));
    }

    @Test( priority = 3 )
    public void confirmShoppingModal(){

        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        ConfirmShoppingModal.on(webDriver);
        Assert.assertTrue(IsPurchaseOrderDisplayed.on(webDriver));

    }

    @Test(priority = 4)
    public void verifyProductNameSelection(){

        SearchInGoogle.as(webDriver,wordToSearch);
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, productToSearch);
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        ConfirmShoppingModal.on(webDriver);
        IsPurchaseOrderDisplayed.on(webDriver);
        Assert.assertTrue(IsProductSelected.verify(webDriver,"Consola Sony PS5 Digital 825GB"));

    }
}
