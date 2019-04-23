package com.Tarasov.CurrencyConverter.Client;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create object from user data
 */
public class UserRequest implements Serializable {
    private String currencyFrom;
    private String currencyTo;
    private String valueOfCurrency;

    /**
     * Constructor of UserRequest for conversion
     * @param currencyFrom - currency to convert
     * @param currencyTo - result currency
     * @param valueOfCurrency - value fo currency that will be convert
     */
    public UserRequest(String currencyFrom, String currencyTo,BigDecimal valueOfCurrency){
        this.currencyFrom = currencyFrom;
        this.valueOfCurrency = valueOfCurrency.toString();
        this.currencyTo = currencyTo;
    }

    /**
     *  Constructor of UserRequest for exchange rates
     * @param currencyFrom - currency to exchange rate
     */
    public UserRequest(String currencyFrom){
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getValueOfCurrency() {
        return valueOfCurrency;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }
}
