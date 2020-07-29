package yenyen.testapi.user;

import com.github.javafaker.Faker;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;


import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import yenyen.api.user.PostUser;
import yenyen.base.BaseUserTest;
import yenyen.models.user.Register;

/**
 * Unit test for simple App.
 */
public class RegisterTest extends BaseUserTest {
    /**
     * Rigorous Test :-)
     */
    private PostUser postUser;
    private Response response;
    private Faker faker;

    @BeforeEach
    public void setup() {

        postUser = new PostUser();
        faker = new Faker();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/register.csv", numLinesToSkip = 1)
    public void registerFail(String name, String email, String pass, String pass_conf, String reason){

        response = postUser.createUser(new Register.RegisterBuilder(name, email, pass).setAction("register")
                                                    .setPassword_confirmation(pass_conf).build());

//        response = postUser.createUser(new Register().setAction("register")
//                                                    .setUserName(name).setEmail(email).setPassword(pass)
//                                                    .setPassword_confirmation(pass_conf));

        checkRegister(response,-1, "failed");
        Assertions.assertEquals(reason, response.path("reason"));

    }

    @Test
    public void registerSuccess() {
        response = postUser.createUser(new Register.RegisterBuilder(faker.name().username(),faker.internet().emailAddress(), "123456" ).setAction("register")
                                                    .setPassword_confirmation("123456").build());
        checkRegister(response, 0, "success");
        response.then().body("user", Matchers.notNullValue());
    }

    @AfterEach
    public void clearData(){
        System.out.println("After Each cleanUpEach() method called");
    }

}
