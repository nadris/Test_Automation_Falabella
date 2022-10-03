package tasks;

import actions.Click;
import actions.Enter;
import actions.SelectDropdown;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;
import ui.EmailInformationPageUI;

public class CompleteFormAddressInformation {
    public static void add(WebDriver driver, String department,String province, String district, String street, String streetNumber ,String reference ){
        VisibilityOfElementLocated.on(driver, AddressInformationModalUI.addressInformationModal);
        SelectDropdown.on(driver,AddressInformationModalUI.department,department,AddressInformationModalUI.clickDepartament);
        SelectDropdown.on(driver,AddressInformationModalUI.province,province,AddressInformationModalUI.clickProvince);
        SelectDropdown.on(driver,AddressInformationModalUI.district,district,AddressInformationModalUI.clickDistrict);
        Enter.text(driver,AddressInformationModalUI.street, street);
        Enter.text(driver, AddressInformationModalUI.streetNumber, streetNumber);
        Enter.text(driver, AddressInformationModalUI.reference, reference);
        Click.on(driver, AddressInformationModalUI.confirmAddressButton);
    }
}
