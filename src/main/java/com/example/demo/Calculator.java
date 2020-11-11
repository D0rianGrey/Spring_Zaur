package com.example.demo;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            while (true) {
                double num1 = getDouble();
                double num2 = getDouble();
                String operation = getOperation();
                double result = calc(num1, num2, operation);
                //double result2 = calc2(num1, num2, Operations.ADDITION);
                System.out.println("Результат операции: " + result);
                System.out.println("Хотите еще выполнить операции ?");
                System.out.println("Да - 1");
                System.out.println("Нет - 2");
                int a = scanner.nextInt();
                if (a == 2) {
                    break;
                }

            }
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }

    }

    public static double getDouble() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static String getOperation() {
        System.out.println("Введите операцию:");
        String operation;
        if (scanner.hasNext()) {
            operation = scanner.next();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, String operation) {
        double result;
        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
            }
        }
        return result;
    }

    public static double calc2(double num1, double num2, Operations operations) {
        double result;
        switch (operations) {
            case ADDITION -> result = num1 + num2;
            case SUBTRACTION -> result = num1 - num2;
            case MULTIPLICATION -> result = num1 * num2;
            case DIVISION -> result = num1 / num2;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
            }
        }
        return result;
    }


}
