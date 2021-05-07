package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class a_navigate_to_twitter_website extends Abstract_Class{

    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public a_navigate_to_twitter_website(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //navigate to twitter;
    public void NavigateTo(){
        driver.navigate().to("https://twitter.com/");
    }//end of method


}//end of public class
