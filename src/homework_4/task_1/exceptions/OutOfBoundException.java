package homework_4.task_1.exceptions;

public class OutOfBoundException extends ArrayIndexOutOfBoundsException {

    public OutOfBoundException() {
        super();
        System.out.println("Вы попали в исключение OutOfBoundException");
    }

}
