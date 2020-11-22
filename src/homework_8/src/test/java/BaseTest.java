package homework_8.src.test.java;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.specification.*;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private static final String token = "e77265ac913ace5c1f7bfe62e66a957560071f7b7a76acd14ce7ae76a85212a2";
    protected static RequestSpecification requestSpecification;
    protected static ResponseSpecification responseSpecification;
    protected static Header requestHeader;

    @BeforeMethod
    public static void setUp() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://gorest.co.in/")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .expectContentType(ContentType.JSON)
                .build();

        requestHeader = new Header("Authorization", "Bearer " + token);
    }

}
