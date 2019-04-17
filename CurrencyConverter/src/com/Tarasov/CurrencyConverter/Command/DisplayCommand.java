package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;

public class DisplayCommand implements AbstractCommand {
    @Override
    public void execute() {

    }
    public void execute(Object response,Object clientRequest) {
        System.out.printf("%s %s %s %s %s",((ClientRequest)clientRequest).getValueOfCurrency(),((ClientRequest)clientRequest).getCurrencyFrom()
        ,"=",response,((ClientRequest)clientRequest).getCurrencyTo().toString());

    }
    @Override
    public String[] getChoice() {
        return new String[0];
    }
}
