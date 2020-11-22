package homework_8.src.test.resources;

import homework_8.src.main.java.user.Gender;
import homework_8.src.main.java.user.Status;
import org.testng.annotations.DataProvider;

public class UserTestDataProvider {

    @DataProvider
    public Object[][] postUserDataProvider() {
        return new Object[][] {
                {"Jane2", "jane4641@yandex.ru", Gender.Female, Status.Active},
        };
    }

    @DataProvider
    public Object[][] getUserDataProvider() {
        return new Object[][] {
                {"35"},
        };
    }

    @DataProvider
    public Object[][] putUserDataProvider() {
        return new Object[][] {
                {"Jack3", "jack@yandex.ru", Gender.Male, Status.Active, "67"},
        };
    }

}
