package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;

import java.util.Scanner;

public class ChooseValueCommand implements AbstractCommand {
    @Override
    public void execute() {




        String[][] data = ArrayDataBase.getDataBase();
        System.out.println("Выберите исходную валюту ");

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data[i].length - 1; j++) {
                System.out.println(j+1 + ": " + data[j][0]);
            }
        }
        Scanner sc1 = new Scanner(System.in);
        int value1 = sc1.nextInt();

        System.out.println("Выберите итоговую валюту ");
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data[i].length - 1; j++) {
                System.out.println(j+1 + ": " + data[j][1]);
            }
        }
        Scanner sc2 = new Scanner(System.in);
        int value2 = sc2.nextInt();
        //далее value1 и value2 закидываем в объект
    }

    @Override
    public String[] getChoice() {
        return null;
    }
}
