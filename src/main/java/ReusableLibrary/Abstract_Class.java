package ReusableLibrary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;

public class Abstract_Class {
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;
    @BeforeSuite
    public void setDriver() throws IOException, InterruptedException {
        driver = Reusable_Actions.defineTheDriver();

        reports = new ExtentReports("src/main/java/HTMLReport/Twitter.html");
    }
    // Report and capture test name store in logger
    @BeforeMethod
    public void captureTestName(Method methodName){
        logger = reports.startTest(methodName.getName());
    }


    //end the test,,
    @AfterMethod
    public void endLogger(){
        reports.endTest(logger);
    }

    @AfterSuite
    public void closeDriver() {
        // flush the logs for the report
        reports.flush();
        driver.quit();
    }//end of after suit

}//end of public class
