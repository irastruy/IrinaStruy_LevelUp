package homework_8.src.main.java;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import homework_8.src.main.java.user.UserRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiObject {

    private UserRequest userReq;
    private long code;
    private Object meta;

    public void setCode(long code) {
        this.code = code;
    }

    public void setUserReq(UserRequest userReq) {
        this.userReq = userReq;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "ApiObject {" +
                "code=" + code + "," +
                "meta=" + meta + "," +
                "data {" + userReq + "}}";
    }


}
