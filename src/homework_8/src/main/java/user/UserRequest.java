package homework_8.src.main.java.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import homework_8.src.main.java.user.Gender;
import homework_8.src.main.java.user.Status;


@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest {

    private long id;
    private String email;
    private String name;
    private Gender gender;
    private Status status;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("updatedAt")
    private String updatedAt;


    public UserRequest(String name, String email, Gender gender, Status status) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.status = status;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id + "" +
                "name='" + name + "" +
                ", gender=" + gender +
                ", email='" + email + "" +
                ", status=" + status +
                ", createdAt='" + createdAt + "" +
                ", updatedAt='" + updatedAt + "" +
                '}';
    }
}
