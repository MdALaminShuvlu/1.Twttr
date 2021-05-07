import ReusableLibrary.Abstract_Class;
import Use_Case_1.a_Base_class;
import org.testng.annotations.Test;


public class UI_Automation_And_UI_Result extends Abstract_Class {


    @Test(priority = 1)
    public void UseCase1() throws InterruptedException {


        //navigate to Twitter
        a_Base_class.a_navigate_to_twitter_website().NavigateTo();
        //enter user name&password
        a_Base_class.b_enter_user_name_and_password().ClickOnLogin();
        a_Base_class.b_enter_user_name_and_password().PassUserId("@HossainS9");
        a_Base_class.b_enter_user_name_and_password().Password("MypasswordIspassword12");

        //click on login
        a_Base_class.c_click_on_login().login();
        //click on tweet icon
        a_Base_class.d_click_on_tweet_icon_on_left_side_in_blue().ClickOnTweet();
        //enter your tweet from pop up message
        a_Base_class.e_on_pop_up_message_enter_your_tweet().ClickOnAddPicture();
        Thread.sleep(2000);
        a_Base_class.e_on_pop_up_message_enter_your_tweet().UploadImg("C:\\Users\\hossa\\OneDrive\\Desktop\\Doge.jpg");
        Thread.sleep(2000);
        a_Base_class.e_on_pop_up_message_enter_your_tweet().WriteAMessage(" DogeToDaMoon ");
        //click on tweet button
        Thread.sleep(2000);
        a_Base_class.f_click_on_the_tweet_button().ClickOnTweetButton();
        //verify current tweet
        Thread.sleep(2000);
        a_Base_class.g_verify_your_current_tweet().assertions();
    }//end of test 1

}//end of public class
