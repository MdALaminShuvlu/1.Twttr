package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class f_click_on_the_tweet_button extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public f_click_on_the_tweet_button(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class
    //ClickOnTweetButton
    @FindBy(xpath = "//div[@data-testid='tweetButton']")
    WebElement ClickOnTweetButton;

    //ClickOnTweetButton
    public void ClickOnTweetButton(){
        Reusable_Actions.clickOnElement(driver,ClickOnTweetButton,logger,"ClickOnTweetButton");
    }//end of ClickOnTweetButton method

}//end of public class
