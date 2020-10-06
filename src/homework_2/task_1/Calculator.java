package homework_2.task_1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator applicationCalculator = new Calculator();
        applicationCalculator.startApplication();

    }

    public void startApplication() {

        System.out.println("Добро пожаловать в Калькулятор 2020! ");

        double number1 = getDoubleNumberFromUserScanner("Введите первое число ");

        double number2 = getDoubleNumberFromUserScanner("Введите второе число ");

        boolean flag = true;
        while (flag) {
            int action = getInNumberFromUserScanner("Выберите операцию: сумма - 1, вычитание - 2, умножение - 3, возведение в степень - 4, факториал - 5, фибоначчи - 6, для выхода нажмите 7");

            switch (action) {
                case 1:
                    getAddResult(number1, number2);
                    break;

                case 2:
                    getSubtractResult(number1, number2);
                    break;

                case 3:
                    getMultiplyResult(number1, number2);
                    break;

                case 4:
                    getPowerResult((int) number1, (int) number2);
                    break;

                case 5:
                    getFactorialResult((int) number1);
                    break;

                case 6:
                    getFibonachiResult((int) number1);
                    break;

                case 7:
                    flag = false;
                    break;
                default:
                    break;
            }


        }
    }

    private double getDoubleNumberFromUserScanner(String infoStringForScanner) {
        System.out.println(infoStringForScanner);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private Integer getInNumberFromUserScanner(String infoStringForScanner) {
        System.out.println(infoStringForScanner);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void getAddResult(double a, double b) {
        double sum = a + b;
        System.out.println("Сумма чисел равна " + sum);
    }

    private static void getSubtractResult(double a, double b) {
        double subtractResult = a - b;
        System.out.println("Вычитание чисел равно " + subtractResult);
    }

    private static void getMultiplyResult(double a, double b) {
        double multiplyResult = a * b;
        System.out.println("Умножение чисел равно " + multiplyResult);
    }

    private static void getPowerResult(int number, int power) {
        double powerResult = -1;
        for (int i = 2; i <= power; i++) {
            powerResult = number * number;
        }
        System.out.println("Результат возведения в степень равен " + powerResult);
    }

    private static void getFactorialResult(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Факториал натурального числа: " + result);
    }

    private static void getFibonachiResult(int numberFibonachi) {
        int fibonachiResult = 0;
        if (numberFibonachi == 2) fibonachiResult = 1;

        int number1 = 0;
        int number2 = 1;
        for (int i = 3; i <= numberFibonachi; ++i) {
            int nextValue = number1 + number2;
            number1 = number2;
            number2 = nextValue;
            fibonachiResult = number2;
        }
        System.out.println("Значение числа равно: " + fibonachiResult);
    }

}