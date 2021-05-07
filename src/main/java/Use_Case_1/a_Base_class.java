package Use_Case_1;

import ReusableLibrary.Abstract_Class;

public class a_Base_class extends Abstract_Class {

    //this page class is a static reference for the page object classes
    //so I can use it on my test class


    public static a_navigate_to_twitter_website a_navigate_to_twitter_website(){
        a_navigate_to_twitter_website a_navigate_to_twitter_website = new a_navigate_to_twitter_website(driver);
        return  a_navigate_to_twitter_website;
    }//end

    public static b_Enter_user_name_and_password b_enter_user_name_and_password(){
        b_Enter_user_name_and_password b_enter_user_name_and_password = new b_Enter_user_name_and_password(driver);
        return  b_enter_user_name_and_password;
    }//end

    public static c_click_on_login c_click_on_login(){
        c_click_on_login c_click_on_login = new c_click_on_login(driver);
        return  c_click_on_login;
    }//end

    public static d_click_on_tweet_icon_on_left_side_in_blue d_click_on_tweet_icon_on_left_side_in_blue(){
        d_click_on_tweet_icon_on_left_side_in_blue d_click_on_tweet_icon_on_left_side_in_blue = new d_click_on_tweet_icon_on_left_side_in_blue(driver);
        return d_click_on_tweet_icon_on_left_side_in_blue ;
    }//end

    public static e_on_pop_up_message_enter_your_tweet e_on_pop_up_message_enter_your_tweet(){
        e_on_pop_up_message_enter_your_tweet e_on_pop_up_message_enter_your_tweet = new e_on_pop_up_message_enter_your_tweet(driver);
        return e_on_pop_up_message_enter_your_tweet;
    }//end

    public static f_click_on_the_tweet_button f_click_on_the_tweet_button() {
        f_click_on_the_tweet_button f_click_on_the_tweet_button = new f_click_on_the_tweet_button(driver);
        return f_click_on_the_tweet_button;
    }//end

    public static g_verify_your_current_tweet g_verify_your_current_tweet() {
        g_verify_your_current_tweet g_verify_your_current_tweet = new g_verify_your_current_tweet(driver);
        return g_verify_your_current_tweet;
    }//end


    public static i_Verify_Tweet_Is_Not_Present i_verify_tweet_is_not_present() {
        i_Verify_Tweet_Is_Not_Present i_verify_tweet_is_not_present = new i_Verify_Tweet_Is_Not_Present(driver);
        return i_verify_tweet_is_not_present;
    }//end

    public static j_Logout_From_Twitter j_logout_from_twitter() {
        j_Logout_From_Twitter j_logout_from_twitter = new j_Logout_From_Twitter(driver);
        return j_logout_from_twitter;
    }//end

}//end of public class
