package homework_8.src.main.java.comment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentsRequest {

    private long id;
    private String name;
    private String email;
    private String body;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("updatedAt")
    private String updatedAt;

    @JsonProperty("post_id")
    private long postId;

    public CommentsRequest(String name, String email, String body, long postId) {
        this.name = name;
        this.body = body;
        this.email = email;
        this.postId = postId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long status) { this.postId = postId;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id + "," +
                "name=" + name + "," +
                "body=" + body + "," +
                "email=" + email + "," +
                "post_id=" + postId + "," +
                "createdAt='" + createdAt + "," +
                "updatedAt='" + updatedAt + "" +
                '}';
    }
}
