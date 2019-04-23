package com.Tarasov.CurrencyConverter.DataBase;

import com.Tarasov.CurrencyConverter.Client.UserRequest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * Class that emulated database
 * Filling it
 * And update exchange rate in separate thread
 */
public class ArrayDataBase implements IDataBase,Runnable,Serializable {
    static String dataBase[][];

    /**
     * Initialization of database
     */
    @Override
    public synchronized void initialize() {

        dataBase  = new String[56][3];

        dataBase[0][0] = "USD";dataBase[0][1] = "EUR";dataBase[0][2] = "0.889";
        dataBase[1][0] = "EUR";dataBase[1][1] = "USD";dataBase[1][2] = "1.125";
        dataBase[2][0] = "USD";dataBase[2][1] = "BYN"; dataBase[2][2] = "2.088";
        dataBase[3][0] = "BYN";dataBase[3][1] = "USD";dataBase[3][2] = "0.479";
        dataBase[4][0] = "EUR";dataBase[4][1] = "BYN";dataBase[4][2] = "2.348";
        dataBase[5][0] = "BYN";dataBase[5][1] = "EUR";dataBase[5][2] = "0.425";
        dataBase[6][0] = "JPY";dataBase[6][1] = "EUR";dataBase[6][2] = "0.0079";
        dataBase[7][0] = "EUR";dataBase[7][1] = "JPY";dataBase[7][2] = "125.908";
        dataBase[8][0] = "USD";dataBase[8][1] = "JPY"; dataBase[8][2] = "111.927";
        dataBase[9][0] = "JPY";dataBase[9][1] = "USD";dataBase[9][2] = "0.0089";
        dataBase[10][0] = "JPY";dataBase[10][1] = "BYN";dataBase[10][2] = "0.0186";
        dataBase[11][0] = "BYN";dataBase[11][1] = "JPY";dataBase[11][2] = "53.603";

        dataBase[12][0] = "GBP";dataBase[12][1] = "EUR";dataBase[12][2] = "1.154";
        dataBase[13][0] = "EUR";dataBase[13][1] = "GBP";dataBase[13][2] = "0.866";
        dataBase[14][0] = "GBP";dataBase[14][1] = "USD";dataBase[14][2] = "1.298";
        dataBase[15][0] = "USD";dataBase[15][1] = "GBP"; dataBase[15][2] = "0.770";
        dataBase[16][0] = "JPY";dataBase[16][1] = "GBP";dataBase[16][2] = "0.00687";
        dataBase[17][0] = "GBP";dataBase[17][1] = "JPY";dataBase[17][2] = "145.353";
        dataBase[18][0] = "BYN";dataBase[18][1] = "GBP";dataBase[18][2] = "0.368";
        dataBase[19][0] = "GBP";dataBase[19][1] = "BYN";dataBase[19][2] = "2.712";

        dataBase[20][0] = "CNY";dataBase[20][1] = "EUR";dataBase[20][2] = "0.132";
        dataBase[21][0] = "EUR";dataBase[21][1] = "CNY";dataBase[21][2] = "7.548";
        dataBase[22][0] = "CNY";dataBase[22][1] = "USD";dataBase[22][2] = "0.149";
        dataBase[23][0] = "USD";dataBase[23][1] = "CNY";dataBase[23][2] = "6.709";
        dataBase[24][0] = "CNY";dataBase[24][1] = "GBP";dataBase[24][2] = "0.1147";
        dataBase[25][0] = "GBP";dataBase[25][1] = "CNY";dataBase[25][2] = "8.713";
        dataBase[26][0] = "BYN";dataBase[26][1] = "CNY";dataBase[26][2] = "3.212";
        dataBase[27][0] = "CNY";dataBase[27][1] = "BYN";dataBase[27][2] = "0.3112";
        dataBase[28][0] = "CNY";dataBase[28][1] = "JPY";dataBase[28][2] = "16.680";
        dataBase[29][0] = "JPY";dataBase[29][1] = "CNY";dataBase[29][2] = "0.0599";

        dataBase[30][0] = "RUB";dataBase[30][1] = "EUR";dataBase[30][2] = "0.0139";
        dataBase[31][0] = "EUR";dataBase[31][1] = "RUB";dataBase[31][2] = "71.750";
        dataBase[32][0] = "RUB";dataBase[32][1] = "USD";dataBase[32][2] = "0.0156";
        dataBase[33][0] = "USD";dataBase[33][1] = "RUB";dataBase[33][2] = "63.794";
        dataBase[34][0] = "RUB";dataBase[34][1] = "GBP";dataBase[34][2] = "0.0120";
        dataBase[35][0] = "GBP";dataBase[35][1] = "RUB";dataBase[35][2] = "82.851";
        dataBase[36][0] = "BYN";dataBase[36][1] = "RUB";dataBase[36][2] = "30.550";
        dataBase[37][0] = "RUB";dataBase[37][1] = "BYN";dataBase[37][2] = "0.0327";
        dataBase[38][0] = "RUB";dataBase[38][1] = "JPY";dataBase[38][2] = "1.754";
        dataBase[39][0] = "JPY";dataBase[39][1] = "RUB";dataBase[39][2] = "0.5700";
        dataBase[40][0] = "CNY";dataBase[40][1] = "RUB";dataBase[40][2] = "9.509";
        dataBase[41][0] = "RUB";dataBase[41][1] = "CNY";dataBase[41][2] = "0.105";


        dataBase[42][0] = "PLN";dataBase[42][1] = "USD";dataBase[42][2] = "0.262";
        dataBase[43][0] = "USD";dataBase[43][1] = "PLN";dataBase[43][2] = "3.804";
        dataBase[44][0] = "PLN";dataBase[44][1] = "GBP";dataBase[44][2] = "0.202";
        dataBase[45][0] = "GBP";dataBase[45][1] = "PLN";dataBase[45][2] = "4.939";
        dataBase[46][0] = "BYN";dataBase[46][1] = "PLN";dataBase[46][2] = "1.823";
        dataBase[47][0] = "PLN";dataBase[47][1] = "BYN";dataBase[47][2] = "0.548";
        dataBase[48][0] = "PLN";dataBase[48][1] = "JPY";dataBase[48][2] = "29.421";
        dataBase[49][0] = "JPY";dataBase[49][1] = "PLN";dataBase[49][2] = "0.03398";
        dataBase[50][0] = "CNY";dataBase[50][1] = "PLN";dataBase[50][2] = "0.566";
        dataBase[51][0] = "PLN";dataBase[51][1] = "CNY";dataBase[51][2] = "1.763";
        dataBase[52][0] = "PLN";dataBase[52][1] = "RUB";dataBase[52][2] = "16.769";
        dataBase[53][0] = "RUB";dataBase[53][1] = "PLN";dataBase[53][2] = "0.0596";
        dataBase[54][0] = "EUR";dataBase[54][1] = "PLN";dataBase[54][2] = "4.2801";
        dataBase[55][0] = "PLN";dataBase[55][1] = "EUR";dataBase[55][2] = "0.233";


        // Update exchange rate(database[i][2]) in database
        new Thread(() -> {
            try {

                while (true) {
                    BigDecimal decimal = new BigDecimal("0.001"); // value that will be increase
                    synchronized (dataBase) {
                        for (int i = 0; i < dataBase.length; i++) {
                            BigDecimal bigDecimal = new BigDecimal(dataBase[i][2]);
                            bigDecimal = bigDecimal.add(decimal);
                            dataBase[i][2] = bigDecimal.toString();
                        }
                        try {
                            Thread.sleep(5000);
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

    /**
     * Get currency like Set
     * For creation currencyMap
     * @return - currency like Set
     */
    private static Set<String> getCurrencySet() {
         Set<String> currencySet = new HashSet<>();
          for (int i= 0; i<getDataBase().length;i++){
              currencySet.add(getDataBase()[i][0]);
          }
          return Collections.synchronizedSet(currencySet);
    }
    /**
     * Get currency like Map
     * For display currency to user
     * @return - currency like Map
     */
    public static Map<Integer,String> getCurrencyMap(){
        Map<Integer,String> currencyMap = new HashMap<>();
        int temp = 1;                                           // number of first currency
        for (Object s : getCurrencySet()){
            currencyMap.put(temp,s.toString());
            temp++;
        }
        return  Collections.synchronizedMap(currencyMap);
    }

    /**
     * Get database like List for exchanging rate
     * @param currency - user data
     * @return exchange rate like List
     */
    public static List<Integer> toList (Object currency) {
        List list = new ArrayList();
        String[][] array = getDataBase();
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length;j++)
            if (array[i][0].equals(((UserRequest)currency).getCurrencyFrom())){
                list.addAll(Arrays.asList(array[i][j]));
            }
        }
        return list;
    }



    @Override
    public void run() {

    }
}
