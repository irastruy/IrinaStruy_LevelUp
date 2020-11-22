package homework_8.src.main.java.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostRequest {

    private long id;
    private String title;
    private String body;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("updatedAt")
    private String updatedAt;

    @JsonProperty("user_id")
    private long userId;


    public PostRequest(String title, String body, long user_id) {
        this.body = body;
        this.title = title;
        this.userId = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long status) { this.userId = userId;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id + "," +
                "body=" + body + "," +
                "title=" + title + "," +
                "user_id=" + userId + "," +
                "createdAt='" + createdAt + "," +
                "updatedAt='" + updatedAt + "" +
                '}';
    }
}
