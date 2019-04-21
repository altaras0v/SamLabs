package com.Tarasov.CurrencyConverter.Client;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserRequest implements Serializable {
    private String currencyFrom;
    private String valueOfCurrency;

    public UserRequest(String currencyFrom, BigDecimal valueOfCurrency){
        this.currencyFrom = currencyFrom;
        this.valueOfCurrency = valueOfCurrency.toString();
    }
    public UserRequest(String currencyFrom){
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getValueOfCurrency() {
        return valueOfCurrency;
    }
}
