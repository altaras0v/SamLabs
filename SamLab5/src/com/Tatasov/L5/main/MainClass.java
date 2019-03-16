package com.Tatasov.L5.main;

import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;
import Tasks.Task5;

import java.io.FileNotFoundException;

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

            }
        }
        task5();
    }

    private static void task1() {
        Task1.Task1();
    }
    private static void task2() {
            Task2.Task2();
    }
    private static void task3() {
        Task3.Task3();
    }
    private static void task5() {
        Task5.Task5();
    }
}
