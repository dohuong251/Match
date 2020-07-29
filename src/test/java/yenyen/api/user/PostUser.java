package yenyen.api.user;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostUser {

//    public Response createUser(Object object){
//        Response response = given().log().all()
////                .header("Author", "Beare auth_token")
//                .contentType(ContentType.JSON)
//                .body(object)
//                .post();
//        return response ;
//    }

    public Response createUser(Object object){
        Response response = given().log().all()
//                .header("Author", "Beare auth_token")
                .contentType(ContentType.JSON)
                .body(object)
                .post();
        return response ;
    }
}
