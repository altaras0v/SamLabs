package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

/**
 * Class which creates request with currency and value of currency that users entered
 */
public class ConvertCurrencyCommand implements AbstractCommand {

    private static ClientRequest clientRequest;

    /**
     * Asks currency and value of currency from user and create object of class ClientRequest
     * @param namesOfCurrency - list(map like data structure) of names of currency
     */
    public void execute(Object namesOfCurrency) {
        System.out.println("Выберите валюту: ");
        Map<Integer, String> map = (Map<Integer, String>) namesOfCurrency;     //Key - number of currency, Value - name of currency
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        int currencyFrom = scanner.nextInt();                                   //User chooses currency

        System.out.println("Введите сумму: ");
        BigDecimal value = scanner.nextBigDecimal();

        clientRequest = new ClientRequest(map.get(currencyFrom), value);
    }

    @Override
    public void execute() {
    }

    public static ClientRequest getClientRequest() {
        return clientRequest;
    }
}