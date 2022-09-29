package ui;

import org.openqa.selenium.By;

public class DeliveryInstructionsPageUI {

    public static By formInstructions = By.id("fbra_checkoutRegionAndComuna");
    public static By departamentInput = By.id("region");
    public static By cityInput = By.id("ciudad");
    public static By neighborhoodInput = By.id("comuna");
    public static By continueButton = By.xpath("//div[@class= 'fbra_formItem fbra_formItem--Button fbra_input--field04']//button");
}
