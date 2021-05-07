package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class j_Logout_From_Twitter extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public j_Logout_From_Twitter(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class
    //click on account menu
    @FindBy(xpath = "//div[@aria-label='Account menu']")
    WebElement menu;
    //logout
    @FindBy(xpath = "//a[@data-testid='AccountSwitcher_Logout_Button']")
    WebElement logout;

    public void menu(){
        Reusable_Actions.clickOnElement(driver,menu,logger,"menu");
    }
    public void logout(){
        Reusable_Actions.clickOnElement(driver,logout,logger,"logout");
    }

}//end of public class
