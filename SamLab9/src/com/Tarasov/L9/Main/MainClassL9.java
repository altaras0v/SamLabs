package com.Tarasov.L9.Main;

import com.Tarasov.L9.Tasks.FileManager;

import java.io.File;
import java.io.IOException;

public class MainClassL9 {
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
        task1();
    }

    private static void task1() {
        try {
            FileManager.inputter();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}