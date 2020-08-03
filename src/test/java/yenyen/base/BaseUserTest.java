package yenyen.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import yenyen.Constant;
import yenyen.models.user.Register;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class BaseUserTest {

   @BeforeAll
    public static void init(){
       RestAssured.baseURI = Constant.BASE_URL;

    }

    public void checkRegister(Response response, int expectCode, String expectResult){
        response.then().statusCode(200)
                .body("code", equalTo(expectCode))
                .body("result", equalTo(expectResult));
//                .body("reason",Matchers.equalTo(expectReason));
    }


    public void checkLogin(Response response, String expectResult){

       response.then().statusCode(200)
               .body("result", equalTo(expectResult))
       .body("user", notNullValue());
    }


    @AfterAll
    public static void tearDown(){
        System.out.println("After all");

    }
}
