package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class b_Enter_user_name_and_password extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public b_Enter_user_name_and_password(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //click on login
   @FindBy(xpath = "//*[text()='Log in']")
    WebElement login;

    //useId
    @FindBy(xpath = "//*[@name='session[username_or_email]']")
    WebElement UserId;
    //password
    @FindBy(xpath = "//*[@name='session[password]']")
    WebElement Password;

    //click on login
    public void ClickOnLogin(){
        Reusable_Actions.clickOnElement(driver,login,logger,"click on login");
    }//end of login method

    //UserId
    public void PassUserId(String UserValue){
      Reusable_Actions.sendKeysMethod(driver,UserId,UserValue,logger,"PassUserId");
    }  //end of PassUserId method

    //password
    public void Password(String UserValue){
        Reusable_Actions.sendKeysMethod(driver,Password,UserValue,logger,"Password");
    }//end of PassPassword method

}//end of public class
