import ReusableLibrary.Abstract_Class;
import Use_Case_1.a_Base_class;
import org.testng.annotations.Test;

public class UI_Au_lastPart extends Abstract_Class {

    @Test
    public void LastPart() throws InterruptedException {
        a_Base_class.a_navigate_to_twitter_website().NavigateTo();
        Thread.sleep(1000);
        //a_Base_class.i_verify_tweet_is_not_present().assertions();
        a_Base_class.j_logout_from_twitter().menu();
        a_Base_class.j_logout_from_twitter().logout();
    }//end test
}//end