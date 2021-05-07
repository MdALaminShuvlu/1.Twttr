package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class i_Verify_Tweet_Is_Not_Present extends Abstract_Class{
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public i_Verify_Tweet_Is_Not_Present(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

   /* public void assertions(){
        String x = Reusable_Actions.captureText(driver,"//span[text()='DogeToDaMoon']",0,logger,"aseertion");
        //using soft assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(x,"DogeToDaMoon");
        } //end of assertion
     */

}//end of public class
