package homework_4.task_1;

import homework_3.disches.*;
import homework_3.products.*;
import homework_4.task_1.exceptions.OutOfBoundException;
import homework_4.task_1.exceptions.TestDataException;

import java.util.Random;

public class AppWithException {

    public static void main(String[] args) {
        AppWithException newApp = new AppWithException();
        //newApp.startMethodWithNullPounterEx();
        //newApp.methodWithOutOfBoundEx();
        newApp.methodWithOtherNullPointerEx();

    }

    public void startMethodWithNullPounterEx() {
        Random randomNumber = new Random();
        int i = randomNumber.nextInt(20);

        Soup borscht = null;
        if (i % 2 == 1) {
            borscht = new Borscht(356, 878, 23, 453);
        }

        if (borscht == null) {
            throw new TestDataException("Борщ пуст");
        }

    }

    public void methodWithOutOfBoundEx() {
        Soup borscht = new Borscht(67, 34, 78, 46);
        double summaryCalories = 0;
        Product[] setOfProduct = borscht.getSetsOfProducts();

        try {
            for (int i = 0; i < 100; i++) {
                summaryCalories += setOfProduct[i].getSummaryCalories();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new OutOfBoundException();
        } finally {
            System.out.println("Что-то не так");
        }
    }

    public void methodWithOtherNullPointerEx() {
        Product[] setOfProduct = new Product[] {};
        if (setOfProduct == null || setOfProduct.length == 0) {
            throw new TestDataException("Список продуктов пуст");
        }
    }




}
