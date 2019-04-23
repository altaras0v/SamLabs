package com.Tarasov.CurrencyConverter.Client;

import java.util.Scanner;

/**
 * Class which asks user about actions
 * User enters actions
 * Result will be in variable "result"
 */
public class Interviewer {
    private static int result;

    /**
     * Ask user about actions and read result
     */
    public static void getInterview() {
        System.out.println("Выберите команду: ");
        System.out.printf("%s\n%s\n%s\n", "1.Конвертировать валюту", "2.Узнать курс",
                "3.Выход из программы");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
    }

    /**
     * Ask user about saving result to file
     */
    public static void askAboutSave(){
        System.out.println("Вы хотетие сохранить результаты в файл");
        System.out.printf("%s\n%s\n", "1.Да", "2.Нет");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
    }

    public static int getResult() {
        return result;
    }
}