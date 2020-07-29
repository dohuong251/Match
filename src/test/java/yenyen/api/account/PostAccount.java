package yenyen.api.account;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostAccount {
    private String auth_token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjM2MDgxYTQ4OGQ5ODU4YTAzZTgyZGVkODU3NGZmYjI0NzJhMzNhZDUxOTEyNWMwYWI2NWJhYmM3YjcxYmEzZjQwYTE0YTc0ODJiMGMxNTY3In0.eyJhdWQiOiIzIiwianRpIjoiMzYwODFhNDg4ZDk4NThhMDNlODJkZWQ4NTc0ZmZiMjQ3MmEzM2FkNTE5MTI1YzBhYjY1YmFiYzdiNzFiYTNmNDBhMTRhNzQ4MmIwYzE1NjciLCJpYXQiOjE1OTQ4OTY5MDIsIm5iZiI6MTU5NDg5NjkwMiwiZXhwIjoxNjI2NDMyOTAyLCJzdWIiOiIxODciLCJzY29wZXMiOltdfQ.EHm6Jc22_n75wBGFKP6D2A77dZb4vGUHgzOfvwrbNB5fmVYeQFrlRtBNpkI3RpK7ZTAp1it55APzrVBKTVF2DSfSidVO3gJdSiPyM_JMH6ALZi602KR0pAOwkvJg7H35RYLL7pUB2xCfRId1SAbKlfrULhfH6sBv-MbKa4UdeKl5R-aSQhh5dH39MKlqz5DrwsDNgOGMsAVyhexLasBhjaGyxeYHWr68tYGWB8J78FVmgJ2cwztdDp29pNc64z3vs1z82Ol8D_5oIHm53WyWVKK3IMCNToyRiDK844d7BNA2Ke_zDmcmJtcUkpWQqn4YQ6e-TtKDGNz2mRcRvn6Xrdx_qKlTr0ZdinSZWPWE7YI4GgBm1pa8gly6INhK6za2Ujlx3FPXjNijqfS_wMg-nPxoWT6YbsEjEM7NLQP4H1Udm-a8T6XI7bewf9SOKGiIJNBmZHVYdsBr8N3mh-kaW0QmrB1QQF6Ie5tfNN0XgkwhULvE-9uO4wJ-maQLLPsO7NFaoWJsygB_3WvPwttWYXilgMh5tuG6lE3z078DcFQHyhoAfzhxuJ7fPdOyviRnHji8jDT6k3_607W83tiYK6HwZyhhW6uPw_tb7tNY2S450D8iO_L7ceMeIXJPein5pYACEbjbraJjIaGquRUjsjQpHHNziLPuE2IhpvCVv0Q";
    public Response createUser(Object object){
        Response response = given().log().all()
                .header("Author", "Bearer "+auth_token)
                .contentType(ContentType.JSON)
                .body(object)
                .post();
        return response ;
    }

}
