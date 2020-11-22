package homework_8.src.test.resources;

import org.testng.annotations.DataProvider;

public class CommentsTestDataProvider {

    @DataProvider
    public Object[][] postCommentDataProvider() {
        return new Object[][]{
                {"Jane2", "jane44641@yandex.ru", "hello, its Jane", 45},
        };
    }

    @DataProvider
    public Object[][] getCommentDataProvider() {
        return new Object[][]{
                {"35"},
        };
    }

    @DataProvider
    public Object[][] putCommentDataProvider() {
        return new Object[][]{
                {"Jack3", "jack@yandex.ru", "hello, its Jane", 45, 67},
        };
    }

}