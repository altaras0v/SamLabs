package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayCommand implements AbstractCommand {
    @Override
    public void execute() {

    }
    public void execute(Object response,Object clientRequest) {
        System.out.printf("%s %s %s %s %s",((ClientRequest)clientRequest).getValueOfCurrency(),((ClientRequest)clientRequest).getCurrencyFrom()
        ,"=",response,((ClientRequest)clientRequest).getCurrencyTo().toString());

    }
    public void execute(Object response) {
        ArrayList arrayList = (ArrayList) response;
        System.out.println("Курс валют:");
        for(int i = 0;i<arrayList.size();i=i+3){
            System.out.println("1 "+arrayList.get(i)+ " = " + arrayList.get(i+2)+ " " + arrayList.get(i+1)+"");
        }

    }
    @Override
    public String[] getChoice() {
        return new String[0];
    }
}
