package com.Tarasov.CurrencyConverter.DataBase;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

public class ArrayDataBase implements IDataBase,Runnable,Serializable {
    static String dataBase[][] = new String[4][3];
    @Override
    public synchronized void initialize() {
        dataBase[0][0] = "USD";
        dataBase[0][1] = "EUR";
        dataBase[0][2] = "1.1";
        dataBase[1][0] = "EUR";
        dataBase[1][1] = "USD";
        dataBase[1][2] = "0.99";
        dataBase[2][0] = "USD";
        dataBase[2][1] = "BYN";
        dataBase[2][2] = "0.5";
        dataBase[3][0] = "BYN";
        dataBase[3][1] = "USD";
        dataBase[3][2] = "2";
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
    public static List<Integer> toList (Object currency) {
        List list = new ArrayList();
        String[][] array = ArrayDataBase.getDataBase();
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length;j++)
            if (array[i][0].equals(((ClientRequest)currency).getCurrencyFrom())){
                list.addAll(Arrays.asList(array[i][j]));
            }
        }
        return list;
    }



    @Override
    public void run() {

    }
}
