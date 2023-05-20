package com.zadachi;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {

        System.out.println("введи пример");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws IOException{
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String operator = arr[1];
        if (a >= 11 || a <= 0 || b >= 11 || b <= 0) {
            throw new IOException("ввод >=11 и <=0 запрещён!");
        }

        return switch (operator) {
            case "+" -> Integer.toString(a + b);
            case "-" -> Integer.toString(a - b);
            case "*" -> Integer.toString(a * b);
            case "/" -> Integer.toString(a / b);
            default -> throw new IOException("Ошибка");
        };
        }
    }

