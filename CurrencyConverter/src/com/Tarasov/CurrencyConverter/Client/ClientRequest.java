package com.Tarasov.CurrencyConverter.Client;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClientRequest implements Serializable {
    private String currencyFrom;
    private String currencyTo;
    private String valueOfCurrency;

    public ClientRequest(String currencyFrom, BigDecimal valueOfCurrency){
        this.currencyFrom = currencyFrom;
        this.valueOfCurrency = valueOfCurrency.toString();
    }
    public ClientRequest(String currencyFrom){
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public String getValueOfCurrency() {
        return valueOfCurrency;
    }
}
