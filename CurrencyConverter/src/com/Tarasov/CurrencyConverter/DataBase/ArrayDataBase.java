package com.Tarasov.CurrencyConverter.DataBase;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

public class ArrayDataBase implements IDataBase,Runnable,Serializable {
    static String dataBase[][] = new String[2][3];
    @Override
    public synchronized void initialize() {
        dataBase[0][0] = "USD";
        dataBase[0][1] = "EUR";
        dataBase[0][2] = "1.1";
        dataBase[1][0] = "EUR";
        dataBase[1][1] = "USD";
        dataBase[1][2] = "0.99";
        new Thread(() -> {
            try {

                while (true) {
                    BigDecimal decimal = new BigDecimal("0.001");
                    synchronized (dataBase) {
                        for (int i = 0; i < dataBase.length; i++) {
                            BigDecimal bigDecimal = new BigDecimal(dataBase[i][2]);
                            bigDecimal = bigDecimal.add(decimal);
                            dataBase[i][2] = bigDecimal.toString();
                        }
                       // System.out.println(Arrays.deepToString(dataBase));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static String[][] getDataBase() {
        return dataBase;
    }

    public static Set<String> getCurrencySet() {
         Set<String> currencySet = new HashSet<>();
          for (int i= 0; i<getDataBase().length;i++){
              currencySet.add(getDataBase()[i][0]);
          }
          return Collections.synchronizedSet(currencySet);
    }

    public static Map<Integer,String> getCurrencyMap(){
        Map<Integer,String> currencyMap = new HashMap<>();
        int temp = 1;
        for (Object s : getCurrencySet()){
            currencyMap.put(temp,s.toString());
            temp++;
        }
        return  Collections.synchronizedMap(currencyMap);
    }

    public static String convertValue(ClientRequest clientRequest){
        String s=null;
        for (int i = 0; i < getDataBase().length;i++){
            if(getDataBase()[i][0]==clientRequest.getCurrencyFrom()&&getDataBase()[i][1]==clientRequest.getCurrencyTo()){
                s = convertElement(getDataBase()[i][2],clientRequest.getValueOfCurrency());
            }
        }
        return s;
    }

    private static String convertElement(String currency,String value){
        BigDecimal bigDecimalCurrency = new BigDecimal(currency);
        BigDecimal bigDecimalValue = new BigDecimal(value);
        BigDecimal result = bigDecimalCurrency.multiply(bigDecimalValue);

        return result.toString();
    }


    @Override
    public void run() {

    }
}
