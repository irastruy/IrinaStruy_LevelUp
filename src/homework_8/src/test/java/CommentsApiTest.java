package homework_8.src.test.java;

import homework_8.src.main.java.ApiObject;
import homework_8.src.main.java.comment.CommentsRequest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import homework_8.src.test.resources.*;
import static org.hamcrest.Matchers.equalTo;

public class CommentsApiTest extends BaseTest {

    @Test(dataProvider = "postCommentDataProvider", dataProviderClass = CommentsTestDataProvider.class)
    public void postCommentTest(String name, String email, String body, long postId) {
        CommentsRequest comments = new CommentsRequest(name, email, body, postId);
        ApiObject apiObjectResponse = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .body(comments)
                .when()
                .post("/public-api/comments")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(201))
                .extract()
                .as(ApiObject.class);
        apiObjectResponse.toString();


    }


    @Test(dataProvider = "getCommentDataProvider", dataProviderClass = CommentsTestDataProvider.class)
    public void getCommentTest(String id) {
        CommentsRequest commentsRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .get("/public-api/comments/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(CommentsRequest.class);


    }

    @Test
    public void getCommentsTest() {
        ApiObject commentsRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .get("/public-api/comments/")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(ApiObject.class);

    }

    @Test(dataProvider = "putCommentDataProvider", dataProviderClass = CommentsTestDataProvider.class)
    public void putUserTest(String name, String email, String body, long postId, long id) {
        CommentsRequest comment = new CommentsRequest(name, email, body, postId);
        ApiObject commentsRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .body(comment)
                .when()
                .put("/public-api/comments/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(ApiObject.class);


    }

    @Test(dataProvider = "getCommentDataProvider", dataProviderClass = CommentsTestDataProvider.class)
    public void deleteCommentTest(String id) {
        ApiObject commentRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .delete("/public-api/comments/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(204))
                .extract()
                .as(ApiObject.class);
    }


}
