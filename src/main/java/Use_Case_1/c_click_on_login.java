package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class c_click_on_login extends Abstract_Class{
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public c_click_on_login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //click on login
    @FindBy(xpath = "//*[text()='Log in']")
    WebElement login;


    //click on login method
    public void login(){
        Reusable_Actions.clickOnElement(driver,login,logger,"login");
    }//end of login method

}//end of public class
