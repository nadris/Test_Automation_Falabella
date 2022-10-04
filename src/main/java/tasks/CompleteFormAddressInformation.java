package tasks;

import actions.Click;
import actions.Enter;
import actions.SelectDropdown;
import actions.VisibilityOfElementLocated;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import ui.AddressInformationModalUI;
import ui.EmailInformationPageUI;

import java.io.IOException;

public class CompleteFormAddressInformation {
    public static void add(WebDriver driver, String department,String province, String district, String street, String streetNumber ,String reference ) throws IOException, InterruptedException {
        VisibilityOfElementLocated.on(driver, AddressInformationModalUI.addressInformationModal);
        SelectDropdown.on(driver,AddressInformationModalUI.department,AddressInformationModalUI.clickDepartament,department);
        SelectDropdown.on(driver,AddressInformationModalUI.province,AddressInformationModalUI.clickProvince,province);
        SelectDropdown.on(driver,AddressInformationModalUI.district,AddressInformationModalUI.clickDistrict,district);
        Enter.text(driver,AddressInformationModalUI.street, street);
        Enter.text(driver, AddressInformationModalUI.streetNumber, streetNumber);
        Enter.text(driver, AddressInformationModalUI.reference, reference);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "AddAddressInformation");
        Click.on(driver, AddressInformationModalUI.confirmAddressButton);
    }
}
