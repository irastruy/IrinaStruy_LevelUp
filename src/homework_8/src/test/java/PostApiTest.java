package homework_8.src.test.java;

import homework_8.src.main.java.ApiObject;
import homework_8.src.main.java.post.PostRequest;
import homework_8.src.test.resources.PostsTestDataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostApiTest extends BaseTest {

    @Test(dataProvider = "postPostDataProvider", dataProviderClass = PostsTestDataProvider.class)
    public void postPostTest(String title, String body, long userId) {
        PostRequest posts = new PostRequest(title, body, userId);
        ApiObject apiObjectResponse = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .body(posts)
                .when()
                .post("/public-api/posts")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(201))
                .extract()
                .as(ApiObject.class);

    }


    @Test(dataProvider = "getPostDataProvider", dataProviderClass = PostsTestDataProvider.class)
    public void getPostTest(String id) {
        PostRequest postRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .get("/public-api/posts/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(PostRequest.class);
    }

    @Test
    public void getPostsTest() {
        ApiObject postsRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .get("/public-api/posts/")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(ApiObject.class);
    }

    @Test(dataProvider = "putPostDataProvider", dataProviderClass = PostsTestDataProvider.class)
    public void putUserTest(String title, String body, long userId, long id) {
        PostRequest post = new PostRequest(title, body, userId);
        ApiObject postsRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .body(post)
                .when()
                .put("/public-api/posts/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(200))
                .extract()
                .as(ApiObject.class);


    }

    @Test(dataProvider = "getPostDataProvider", dataProviderClass = PostsTestDataProvider.class)
    public void deletePostTest(String id) {
        ApiObject postRes = given()
                .spec(requestSpecification)
                .header(requestHeader)
                .when()
                .delete("/public-api/posts/" + id)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("code", equalTo(204))
                .extract()
                .as(ApiObject.class);
    }


}

