package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class d_click_on_tweet_icon_on_left_side_in_blue extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public d_click_on_tweet_icon_on_left_side_in_blue(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //click on tweet
    @FindBy(xpath = "//a[contains(@class,'r-1waj6vr r-1loqt21 r-1w2pmg ')]")
    WebElement ClickOnTweet;

    //click on tweet
    public void ClickOnTweet(){
        Reusable_Actions.clickOnElement(driver,ClickOnTweet,logger,"ClickOnTweet");
    }//end of ClickOnTweetMethod
}//end of public class



