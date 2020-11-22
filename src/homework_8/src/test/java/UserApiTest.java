package homework_8.src.test.java;

import homework_8.src.main.java.ApiObject;
import homework_8.src.main.java.user.Gender;
import homework_8.src.main.java.user.Status;
import homework_8.src.main.java.user.UserRequest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import homework_8.src.test.resources.*;
import static org.hamcrest.Matchers.equalTo;

public class UserApiTest extends BaseTest {

    @Test(dataProvider = "postUserDataProvider", dataProviderClass = UserTestDataProvider.class)
    public void postUserTest(String name, String email, Gender gender, Status status) {
        UserRequest user = new UserRequest(name, email, gender, status);
        ApiObject apiObjectResponse = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .body(user)
                .when()
                .post("/public-api/users")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(201))
                .extract()
                .as(ApiObject.class);
    }

    @Test(dataProvider = "getUserDataProvider", dataProviderClass = UserTestDataProvider.class)
    public void getUserTest(String id) {
        UserRequest userRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .get("/public-api/users/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(UserRequest.class);
    }

    @Test
    public void getUsersTest() {
        ApiObject userRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .get("/public-api/users/")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(ApiObject.class);
    }

    @Test(dataProvider = "putUserDataProvider", dataProviderClass = UserTestDataProvider.class)
    public void putUserTest(String name, String email, Gender gender, Status status, String id) {
        UserRequest user = new UserRequest(name, email, gender, status);
        ApiObject userRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .body(user)
                .when()
                .put("/public-api/users/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(ApiObject.class);
    }

    @Test(dataProvider = "getUserDataProvider", dataProviderClass = UserTestDataProvider.class)
    public void deleteUserTest(String id) {
        ApiObject userRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .delete("/public-api/users/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(204))
                .extract()
                .as(ApiObject.class);
    }

}
