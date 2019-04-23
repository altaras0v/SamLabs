package com.Tarasov.CurrencyConverter.DataBase;

import com.Tarasov.CurrencyConverter.Client.UserRequest;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Class that emulated database
 * Filling it
 * And update exchange rate in separate thread
 * Database - text file
 */
public class TextFileDatabase implements IDataBase {
    static String[][] dataBase;
    static String strLine;

    /**
     * Initialization local database
     * Update exchange rate(database[i][2]) in database
     * And return update values to text database
     */
    @Override
    public void initialize() {
        try {

            File statText = new File("C:\\test\\test.txt");

            FileInputStream fstream = new FileInputStream(statText.getAbsolutePath());
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            //for count strings in text database
            FileReader fileReader = new FileReader(statText);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            int lineNumber = 0;
            while (lineNumberReader.readLine() != null){
                lineNumber++;
            }
            lineNumberReader.close();

            dataBase = new String[lineNumber][3];

            readFromFile(br);

            new Thread(() -> {
                try {
                   readFromFile(br);
                    while (true) {
                        BigDecimal decimal = new BigDecimal("0.001");

                        for (int i = 0; i < dataBase.length; i++) {
                            BigDecimal bigDecimal = new BigDecimal(dataBase[i][2]);
                            bigDecimal = bigDecimal.add(decimal);
                            dataBase[i][2] = bigDecimal.toString();
                        }
                        System.out.println(Arrays.deepToString(dataBase));
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //Update text database
                        FileWriter filewriter = new FileWriter(new File(statText.getAbsolutePath()));

                        for (int i = 0; i < dataBase.length; i++) {
                            filewriter.write(dataBase[i][0] + " " + dataBase[i][1] + " " + dataBase[i][2]+"\r\n");


                        }
                        filewriter.flush();
                        filewriter.close();
                    }



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        int temp = 1;
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

    /**
     * Read information from file(database)
     * And fill local database with these values
     * @param br - BufferedReader that matches the file
     */
    private void readFromFile(BufferedReader br) throws IOException {
        int j = 0;
        while ((strLine = br.readLine()) != null){
            String[] words = strLine.split("\\s");              // Разбиение строки на слова с помощью разграничителя (пробел)
            // Вывод на экран
            for(int i = 0;i<words.length;i++) {
                dataBase[j][i] =words[i];
            }
            j++;
        }
    }
}
