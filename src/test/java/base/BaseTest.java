package base;

import com.aventstack.extentreports.Status;
import helper.ReportHelper;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BaseTest {

    protected WebDriver webDriver;
    @BeforeSuite
    public static void setUpSuite() throws Exception {
        ReportHelper.init("resource", "Test");
    }
    @BeforeMethod
    public void setUp(Method method){
        ReportHelper.getInstance().startTest(method.getName());
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportHelper.getInstance().getTest().log(Status.FAIL, "Test failed");
                    break;
                case ITestResult.SKIP:
                    ReportHelper.getInstance().getTest().log(Status.SKIP, "Test skipped");
                    break;
                case ITestResult.SUCCESS:
                    ReportHelper.getInstance().getTest().log(Status.PASS, "Test passed");
                    break;
                default:
                    ReportHelper.getInstance().getTest().log(Status.FAIL, "Test incomplete");
            }

            if(iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null){
                ReportHelper.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.FAIL, "Failure Image");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(webDriver != null)
                webDriver.quit();
        }
    }
    @AfterSuite
    public static void tearDownSuite(){
        ReportHelper.getInstance().flush();
    }

    /*@AfterMethod
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }*/
}
