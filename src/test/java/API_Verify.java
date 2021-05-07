import ReusableLibrary.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class API_Verify extends Abstract_Class {

    String consumerKey = "QuCZ21LikPaceLQM4I0sp4A6y";
    String consumerSecret = "H8EJhHc2Uf8kaFv18Z98W5FgzHMdDwgHOyDDKMKtxg2RItgrjX";
    String accessToken = "1388501250061348866-V0JNNrVwKbOHoOdI4rc6c3aeISKUpi";
    String tokenSecret = "vnEdhwQQAYXhqyBoAIEUN8wZv0X4nX7utN2l4hJ9v3MeL";

    String TweetId;

    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://api.twitter.com/1.1/statuses/";
    }//end of set up

    @Test()
    public void getUserTimeLine() {

        Response Resp=
                given().
                        auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).
                        queryParam("screen_name", "@HossainS9")
                        .when().get("user_timeline.json")
                        .then().extract().response();

        String getTweet=Resp.asString();
        JsonPath js=new JsonPath(getTweet);
        String text1= js.get("text[0]").toString();
        System.out.println("The recent tweet text is "+ text1);
        TweetId=(js.get("id[0]")).toString();
        System.out.println("Id of most recent Tweet is "+TweetId);
        logger.log(LogStatus.INFO, "user time line -  "+ TweetId );

    }//end of get tweet



    @Test(dependsOnMethods ="getUserTimeLine")
    public void getRecentTweet() {
        Response Resp=
                given().
                        auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).
                        queryParam("id", TweetId)
                        .when().get("show.json")
                        .then().extract().response();
        String text= Resp.path("text");
        System.out.println("The recent tweet text is "+ text);
        logger.log(LogStatus.INFO, "Tweet post are "+text);
    }//end of get tweet


    @Test(dependsOnMethods = "getRecentTweet")
//@Test
    public void deleteRecentTweet() {
        given().
                auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).
                queryParam("id", TweetId)
                .when().post("destroy.json")
                .then().extract().response();
        System.out.println("Recent twitter message with id '"+TweetId+"' has been deleted");
        logger.log(LogStatus.INFO, "deleted post are "+TweetId);
    }//end of delete tweet
}
