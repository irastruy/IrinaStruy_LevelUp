package homework_4.task_1.exceptions;

public class TestDataException extends NullPointerException {

    public TestDataException(String message) {
        super(message);
        System.out.println("Вы попали в исключение TestDataException");
    }
}
