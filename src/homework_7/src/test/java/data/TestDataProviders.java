package homework_7.src.test.java.data;

import org.testng.annotations.DataProvider;

public class TestDataProviders {

    @DataProvider
    public Object[][] testDataForNoTestFolderExercise() {
        return new Object[][] {
                {"istrui@mail.ru", "hello, Petersburg", "text text", "Ирина Струй"}
        };
    }

    @DataProvider
    public Object[][] testDataForTestFolderExercise() {
        return new Object[][] {
                {"istrui@mail.ru", "hello, Petersburg Тест", "Тест тест"}
        };
    }

}
