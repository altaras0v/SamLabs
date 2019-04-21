package com.Tarasov.CurrencyConverter.ClientCommand;

import com.Tarasov.CurrencyConverter.Client.UserRequest;

import java.util.ArrayList;

/**
 * Class which displays result on the screen
 */
public class DisplayCommand implements AbstractCommand {
    /**
     * Displays currency and converted result on the screen
     * @param listOfCurrency - list of name of currency and convert value of currency
     * @param userRequest - request data that user entered
     */
    public void execute(Object listOfCurrency, Object userRequest) {
        ArrayList arrayList = (ArrayList) listOfCurrency;
        System.out.println("Курс валют:");
        for (int i = 0; i < arrayList.size(); i = i + 3) {
            System.out.println(((UserRequest) userRequest).getValueOfCurrency() + " " + arrayList.get(i) + " = "
                    + arrayList.get(i + 2) + " " + arrayList.get(i + 1));
        }
    }

    /**
     * Displays exchange rates on the screen
     * @param listOfCurrency - list of name of currency and value of currency
     */
    public void execute(Object listOfCurrency) {
        ArrayList arrayList = (ArrayList) listOfCurrency;
        System.out.println("Курс валют:");
        for (int i = 0; i < arrayList.size(); i = i + 3) {
            System.out.println("1 " + arrayList.get(i) + " = " + arrayList.get(i + 2) + " " + arrayList.get(i + 1) + "");
        }
    }

    @Override
    public void execute() {
    }
}
