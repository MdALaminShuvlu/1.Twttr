package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class g_verify_your_current_tweet extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public g_verify_your_current_tweet(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    public void assertions(){

        /*using soft assert
        String x = "DogeToDaMoon";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(x,driver.getPageSource().contains("DogeToDaMoon"));
        logger.log(LogStatus.INFO, " post is "+ softAssert); */

         //using soft assert
        String x = Reusable_Actions.captureText(driver,"//span[text()='DogeToDaMoon']",0,logger,"aseertion");
        //using soft assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(x,"DogeToDaMoon");

    } //end of assertion



}//end of public class
