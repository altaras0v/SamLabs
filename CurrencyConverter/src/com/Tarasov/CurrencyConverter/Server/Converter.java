package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Converter {
    private  List resultList;
    private ClientRequest clientRequest;

    public Converter(ClientRequest clientRequest) {
        this.clientRequest = clientRequest;
        this.resultList = new ArrayList();
    }

    public void convert() {

        String[][] array = ArrayDataBase.getDataBase();
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length;j++)
                if (array[i][0].equals((clientRequest.getCurrencyFrom()))){
                    array[i][2] = convertElement(array[i][2],(clientRequest).getValueOfCurrency());
                    resultList.addAll(Arrays.asList(array[i][j]));
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

        return resultValue.toString();
    }
}