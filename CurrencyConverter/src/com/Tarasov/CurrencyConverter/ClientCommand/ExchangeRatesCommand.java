package com.Tarasov.CurrencyConverter.ClientCommand;

import com.Tarasov.CurrencyConverter.Client.UserRequest;

import java.util.Map;
import java.util.Scanner;

/**
 * Class which creates request with currency that users entered
 */
public class ExchangeRatesCommand implements AbstractCommand {
    private static UserRequest UserRequest;

    /**
     * Asks currency from user and create object of class UserRequest
     * @param namesOfCurrency - list(map like data structure) of names of currency
     */
    public void execute(Object namesOfCurrency) {
        System.out.println("Выберите валюту");
        Map<Integer, String> map = (Map<Integer, String>) namesOfCurrency;  //Key - number of currency, Value - name of currency
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        Scanner scanner = new Scanner(System.in);                           //User chooses currency
        int currencyFrom = scanner.nextInt();

        UserRequest = new UserRequest(map.get(currencyFrom));

    }

    public static UserRequest getUserRequest() {
        return UserRequest;
    }

    @Override
    public void execute() {

    }
}