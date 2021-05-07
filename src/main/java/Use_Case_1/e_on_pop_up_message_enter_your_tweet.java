package Use_Case_1;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class e_on_pop_up_message_enter_your_tweet extends Abstract_Class{
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public e_on_pop_up_message_enter_your_tweet(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //click on add picture
    @FindBy(xpath = "//div[@aria-label='Add photos or video']")
    WebElement ClickOnAddAPicture;
    @FindBy(xpath ="//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
    WebElement WriteAMessage;

    //click on add picture
    public void ClickOnAddPicture(){
        Reusable_Actions.clickOnElement(driver,ClickOnAddAPicture,logger,"click on add picture");
    }//end of click on add picture

    //picture location path
     public static void UploadImg (String fileLocation) {
        try {
            //Setting clipboard with file location
            StringSelection stringSelection = new StringSelection(fileLocation);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }//end of uploadFile method

    //Write a message
    public void WriteAMessage(String UserValue){
  Reusable_Actions.sendKeysMethod(driver,WriteAMessage,UserValue,logger,"write a message");
    }//end of write a message method



}//end of public class
