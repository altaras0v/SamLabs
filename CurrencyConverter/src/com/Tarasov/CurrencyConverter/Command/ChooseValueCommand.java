package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChooseValueCommand implements AbstractCommand {

    private static ClientRequest clientRequest;

    public void execute(Object response) {

        System.out.println("Выберите исходную валюту: ");
        Map<Integer,String> map = (Map<Integer, String>) response;
        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        int currencyFrom = scanner.nextInt();
        //
        System.out.println("Выберите итоговую валюту: ");
        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        int currencyTo = scanner.nextInt();

        System.out.println("Введите сумму: ");
        BigDecimal value = scanner.nextBigDecimal();

        clientRequest = new ClientRequest(map.get(currencyFrom),map.get(currencyTo),value);
    }

    @Override
    public void execute() {
    }
    @Override
    public String[] getChoice() {
        return new String[0];
    }

    public static ClientRequest getClientRequest() {
        return clientRequest;
    }
}
