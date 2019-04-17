package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;

import java.math.BigDecimal;

import static com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase.getDataBase;

public class Converter {
    private  String result;
    private ClientRequest clientRequest;

    public Converter(ClientRequest clientRequest) {
        this.clientRequest = clientRequest;
        this.result = null;
    }

    public void convert() {
        for (int i = 0; i < getDataBase().length; i++) {
            if (getDataBase()[i][0].equals(clientRequest.getCurrencyFrom()) && getDataBase()[i][1].equals(clientRequest.getCurrencyTo())) {
                setResult(convertElement(getDataBase()[i][2], clientRequest.getValueOfCurrency()));
                break;
            } else continue;


        }
    }


    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    private static String convertElement(String currency, String value) {
        BigDecimal bigDecimalCurrency = new BigDecimal(currency);
        BigDecimal bigDecimalValue = new BigDecimal(value);
        BigDecimal resultValue = bigDecimalCurrency.multiply(bigDecimalValue);

        return resultValue.toString();
    }
}