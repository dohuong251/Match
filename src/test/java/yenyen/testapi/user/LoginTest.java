package yenyen.testapi.user;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yenyen.Constant;
import yenyen.api.user.PostUser;
import yenyen.base.BaseUserTest;
import yenyen.models.user.Login;
import yenyen.models.user.LoginEmail;

public class LoginTest extends BaseUserTest {

    private Response response;
    private PostUser postUser;

    @BeforeEach
    public void setup(){
        postUser = new PostUser();
    }


    @Test
    public void loginEmail(){
        response = postUser.createUser(new LoginEmail().setAction("signin").setAccount_type("EMAIL").setEmail(Constant.EMAIL).setPassword(Constant.PASSWORD));
        response.jsonPath().prettyPrint();
        checkLogin(response, "success");
        Assertions.assertEquals(Constant.EMAIL, response.jsonPath().get("user.Email"));
    }

    @Test
    public void loginFacebook(){
        response = postUser.createUser(new Login().setAction("signin").setAccount_type("FACEBOOK").setFacebook_access_token("EAAREvH6wIPoBACrOqtZAHM5YRMsHP8BzZAXG2kbrpyX0UEoZBifLpeW8T1KfcFlwZCKcnMtShciWZB09q9tcs8n7jv193LoQPoJ3VzanypCSLeuYVhlb9dIS4ZBqCi7LfbLsLVGx8YSXsXmLZB3tDGmw2OemXKbZCw53tYjcdg7nN6kEWafkxNTukNL1ECTTC7xkZB0pucZAunnkLNJ1NrZA5daMlGHqOzsOJlXvyZCpgndd2gZDZD"));
        response.jsonPath().prettyPrint();
        checkLogin(response, "success");
        JsonPath jsonPath = response.body().jsonPath();
        Assertions.assertEquals("dothihuong25195@gmail.com", jsonPath.get("user.Email"));

    }



}
