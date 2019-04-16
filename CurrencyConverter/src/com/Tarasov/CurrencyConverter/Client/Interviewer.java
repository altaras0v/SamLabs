package com.Tarasov.CurrencyConverter.Client;

import java.util.Scanner;

public class Interviewer {
    private static int result;
    public static void getInterview(){
        System.out.println("Выберите команду: ");
        System.out.printf("%s\n%s\n%s\n%s\n","1.Конвертировать валюту","2.Узнать курс",
                "3.Сохранить рзультат в файл","4.Выход из программы");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
    }

    public static int getResult() {
        return result;
    }
}
