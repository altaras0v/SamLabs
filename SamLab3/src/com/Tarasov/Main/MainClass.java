package com.Tarasov.Main;

import com.Tarasov.Util.Checker;
import com.Tarasov.Util.DescriptionBelarus;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Parameter: " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
            }
        }
        task2();
    }

    private static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номинал:");
        int value = in.nextInt();
        System.out.println(Checker.Money.formatMoney(value));
        System.out.println("Введите год:");
        int year = in.nextInt();
        System.out.println(Checker.Year.checkLeapYear(year));
        int[][] mas = new int[3][3];
        System.out.println(Arrays.deepToString(mas));
        System.out.println(Arrays.toString(Checker.Array.linearizeArray(mas)));
    }

    private static void task1() {
        String s = DescriptionBelarus.DISTRICTS.BREST;
        System.out.println(s);
        System.out.println(DescriptionBelarus.fullInfo());
    }
}