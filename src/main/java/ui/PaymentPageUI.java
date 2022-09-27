package ui;

import org.openqa.selenium.By;

public class PaymentPageUI {

    public static By paymentGiftCardOption = By.className("fbra_anchor fbra_appContainer__addCardText fbra_test_addACardText fbra_appContainer__addCardText--closed fbra_test_addACardText--closed");

    public static By giftCardNumberInput = By.id("giftCardNumber");

    public static By giftCardSecurityCodeInput = By.id("giftCardSecurityCode");

    public static By addButton = By.className("fbra_button fbra_test_button fbra_formItem__addGiftCard");

}
