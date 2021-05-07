import ReusableLibrary.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UI_API_2 extends Abstract_Class {

    String consumerKey = "QuCZ21LikPaceLQM4I0sp4A6y";
    String consumerSecret = "H8EJhHc2Uf8kaFv18Z98W5FgzHMdDwgHOyDDKMKtxg2RItgrjX";
    String accessToken = "1388501250061348866-V0JNNrVwKbOHoOdI4rc6c3aeISKUpi";
    String tokenSecret = "vnEdhwQQAYXhqyBoAIEUN8wZv0X4nX7utN2l4hJ9v3MeL";

    String TweetId;

    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://api.twitter.com/1.1/statuses/";
    }//end of setup

    //create 20 post


    @Test(priority = 1)
    public void create_20_post(){
        String tweetPost=null;
        for (int i = 0;i<20;i++){
            tweetPost="I can't delete those post,Nope I can!" + (i+1);
            Response Resp=
                    given().
                            auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).
                            queryParam("status",tweetPost)
                            .when().post("update.json")
                            .then().extract().response();
            logger.log(LogStatus.INFO, "Tweet post are "+tweetPost);

        }//end of loop

    }//end of test
    @Test(priority = 2)
    public void deleteTweets() {
    String tweet= null;
    for (int i = 0;i<20;i++) {
    Response Resp=
    given().
            auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).
            queryParam("screen name","@HossainS9")
            .when().get("user_timeline.json")
            .then().extract().response();

    String Tweet=Resp.asString();
        JsonPath js=new JsonPath(Tweet);
        TweetId =(js.get("id[0]")).toString();

    //delete all post

            given().
                    auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).
                    queryParam("id", TweetId)
                    .when().post("destroy.json")
                    .then().extract().response();
            System.out.println("Recent twitter message with id '" + Tweet + "' has been deleted");
        logger.log(LogStatus.INFO, "Deleted post = " +Tweet);
        }//end of for loop
    }//end of delete tweet


}//end of public class
