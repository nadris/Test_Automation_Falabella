package ui;

import org.openqa.selenium.By;

public class AddressInformationModalUI {

    public static By addressInformationModal = By.xpath("//div[@class=\"jsx-3319042088 info-modal-container\"]");
    public static By department = By.xpath("//input[@placeholder='Selecciona un Departamento']");
    public static By province = By.xpath("//input[@placeholder='Selecciona una Provincia']");
    public static By district =By.xpath("//input[@placeholder='Selecciona un Distrito']");
    public static By street = By.id("testId-Input-street");
    public static By streetNumber = By.id("testId-Input-number");
    public static By reference =By.id("testId-Input-department");

    public static By clickDepartament = By.id("testId-Dropdown-AREQUIPA");
    public static By clickProvince = By.id("testId-Dropdown-AREQUIPA");
    public static By clickDistrict = By.id("testId-Dropdown-AREQUIPA");
    public static By confirmAddressButton = By.id("testId-infoModalFooter-button");

}

