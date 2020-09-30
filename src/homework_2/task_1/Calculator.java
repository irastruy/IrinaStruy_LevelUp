package homework_2.task_1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Калькулятор 2020! ");

        System.out.println("Введите первое число ");
        Scanner sc2 = new Scanner(System.in);
        double num1 = sc2.nextDouble();

        System.out.println("Введите второе число ");
        Scanner sc3 = new Scanner(System.in);
        double num2 = sc3.nextDouble();

        boolean flag = true;
        while (flag) {
            System.out.println("Выберите операцию: сумма - 1, вычитание - 2, умножение - 3, возведение в степень - 4, факториал - 5, фибоначчи - 6, для выхода нажмите 7");
            Scanner sc4 = new Scanner(System.in);
            int action = sc4.nextInt();

            switch (action) {
                case 1:
                    getAddResult(num1, num2);
                    break;

                case 2:
                    getSubtractResult(num1, num2);
                    break;

                case 3:
                    getMultiplyResult(num1, num2);
                    break;

                case 4:
                    getPowerResult((int) num1, (int) num2);
                    break;

                case 5:
                    getFactorialResult((int) num1);
                    break;

                case 6:
                    getFibonachiResult((int) num1);
                    break;

                case 7:
                    flag = false;
                    break;
            }


        }

    }


    private static void getAddResult(double a, double b) {
        double sum = a + b;
        System.out.println("Сумма чисел равна " + sum);
    }

    private static void getSubtractResult(double a, double b) {
        double subtractResult = a * b;
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

    private static int getFibonachiResult(int number) {
        if (number < 2) return number;
        return getFibonachiResult(number - 1) + getFibonachiResult(number - 2);
    }

    private static void printFibonachiResult(int number) {
        System.out.println("Значение числа равно: " + getFibonachiResult(number));
    }

}