package com.Tarasov.CurrencyConverter.Command;


import com.Tarasov.CurrencyConverter.Client.ClientRequest;

import java.util.Map;
import java.util.Scanner;

public class CheckCurrencyCommand implements AbstractCommand {
    static String[] array = new String[1];
    private static ClientRequest clientRequest;


    public void execute(Object response) {
        System.out.println("Выберите валюту");
        Map<Integer,String> map = (Map<Integer, String>) response;
        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        int currencyFrom = scanner.nextInt();

        clientRequest = new ClientRequest(map.get(currencyFrom));

    }
    public static ClientRequest getClientRequest() {
        return clientRequest;
    }

    @Override
    public void execute() {

    }

    @Override
    public String[] getChoice() {
        array[0]="2";
        return array;
    }


}
