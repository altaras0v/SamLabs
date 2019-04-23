package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.Client.UserRequest;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.DataBase.TextFileDatabase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Converter {
    private List resultList;
    private UserRequest UserRequest;

    public Converter(UserRequest UserRequest) {
        this.UserRequest = UserRequest;
        this.resultList = new ArrayList();
    }

    public void convert() {
       // String[][] array = ArrayDataBase.getDataBase();
         String[][] array = TextFileDatabase.getDataBase();
        String[][] result = new String[1][3];                                   // String for result (that we dont change elements in database)

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if ((array[i][0].equals(((UserRequest.getCurrencyFrom()))))&&(array[i][1].equals(((UserRequest.getCurrencyTo()))))) {
                    result[0][0] = array[i][0];
                    result[0][1] = array[i][1];
                    result[0][2] = convertElement(array[i][2], (UserRequest).getValueOfCurrency());

                    resultList.addAll(Arrays.asList(result[0][j]));

                }

        }
        System.out.println(resultList);
    }


    public List getResult() {
        return resultList;
    }

    private static String convertElement(String currency, String value) {
        BigDecimal bigDecimalCurrency = new BigDecimal(currency);
        BigDecimal bigDecimalValue = new BigDecimal(value);
        BigDecimal resultValue = bigDecimalCurrency.multiply(bigDecimalValue);

        System.out.println("Currency:" + bigDecimalCurrency);
        System.out.println("Value:" + bigDecimalValue);
        System.out.println("Result:" + resultValue);

        return resultValue.toString();
    }
}