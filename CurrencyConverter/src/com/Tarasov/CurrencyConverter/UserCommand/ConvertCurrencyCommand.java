package com.Tarasov.CurrencyConverter.UserCommand;

import com.Tarasov.CurrencyConverter.Client.UserRequest;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Class which creates request with currency and value of currency that users entered
 */
public class ConvertCurrencyCommand implements AbstractCommand {

    private static UserRequest UserRequest;

    /**
     * Asks currency and value of currency from user and create object of class UserRequest
     * @param namesOfCurrency - list(map like data structure) of names of currency
     */
    public void execute(Object namesOfCurrency) {
        System.out.println("Выберите исходную валюту: ");
        Map<Integer, String> map = (Map<Integer, String>) namesOfCurrency;     //Key - number of currency, Value - name of currency
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        int currencyFrom = scanner.nextInt();                                   //User chooses currency
        System.out.println("Выберите итоговую валюту: ");
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        int currencyTo = scanner.nextInt();

        String str;
        BigDecimal value;
        while (true) {
            System.out.println("Введите сумму: ");
            str = scanner.next();
            if(isNumeric(str)) {
                value = new BigDecimal(str);
                break;
            }
            System.out.println("Вы ввели некооректные данные");
        }

        UserRequest = new UserRequest(map.get(currencyFrom), map.get(currencyTo), value);
    }

    @Override
    public void execute() {
    }

    public static UserRequest getUserRequest() {
        return UserRequest;
    }
    public static boolean isNumeric(String str)
    {
       return Pattern.matches("[+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?",str);

    }
}