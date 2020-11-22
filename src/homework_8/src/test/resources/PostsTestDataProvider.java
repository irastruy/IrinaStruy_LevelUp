package homework_8.src.test.resources;

import org.testng.annotations.DataProvider;

public class PostsTestDataProvider {

    @DataProvider
    public Object[][] postPostDataProvider() {
        return new Object[][]{
                {"What a wonderful winter", "this story was a 2 years ago...", 45},
        };
    }

    @DataProvider
    public Object[][] getPostDataProvider() {
        return new Object[][]{
                {"37"},
        };
    }

    @DataProvider
    public Object[][] putPostDataProvider() {
        return new Object[][]{
                {"What a wonderful winter", "this story was a 2 years ago...", 67, 98},
        };
    }

}