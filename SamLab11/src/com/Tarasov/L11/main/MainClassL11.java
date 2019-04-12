package com.Tarasov.L11.main;

import com.Tarasov.L11.tasks.Task1;
import com.Tarasov.L11.tasks.Task2;
import com.Tarasov.L11.tasks.Task3;
import com.Tarasov.L11.tasks.Task4;

public class MainClassL11 {

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
        task4();
    }

    private static void task1() {

        Task1.task1();
        System.out.println();
    }

    private static void task2() {

        Task2.task2();

    }
    private static void task3() {

        Task3.task3();

    }
    private static void task4() {

        Task4.task4();

    }
}

