package falabella;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;
import ui.ShoppingModalUI;

public class ProductTest extends BaseTest {

    @Test( priority = 1 )
    public void SearchProduct() {

        SearchInGoogle.as(webDriver,"Falabella Colombia");
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, "PS5");
        Assert.assertTrue(IsProductDisplayed.product(webDriver));
    }

    @Test( priority = 2 )
    public void selectProductAndDisplayModal(){

        SearchInGoogle.as(webDriver,"Falabella Colombia");
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, "PS5");
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        Assert.assertTrue(IsShoppingModalDisplayed.modal(webDriver));
    }

    @Test( priority = 3 )
    public void confirmShoppingModal(){

        SearchInGoogle.as(webDriver,"Falabella Colombia");
        EnterResultigPage.on(webDriver);
        SearchProduct.as(webDriver, "PS5");
        IsProductDisplayed.product(webDriver);
        SelectProduct.as(webDriver);
        ConfirmShoppingModal.on(webDriver);

    }



}
