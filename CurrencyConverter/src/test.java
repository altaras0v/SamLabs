import com.Tarasov.CurrencyConverter.Command.ChooserCommand;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase.getCurrencySet;
import static com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase.getDataBase;

public class test {
    public static void main(String[] args) {
        //ChooserCommand.chooseCommand();
        ArrayDataBase arrayDataBase = new ArrayDataBase();
        arrayDataBase.initialize();
     //   System.out.println(Arrays.deepToString(ArrayDataBase.getDataBase()));
        String[][] mas = ArrayDataBase.getDataBase();
        for(int i = 0; i < mas.length;i++){
            if(mas[i][0]=="EUR"&&mas[i][1]=="USD"){
                System.out.println(mas[i][2]);
                }
            }
        System.out.println();


        Set<String> set= getCurrencySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
           System.out.println(iterator.next());
        }
        Map<Integer,String> map = new HashMap<>();
        int temp = 1;
        for (Object s : getCurrencySet()){

            map.put(temp,s.toString());
            temp++;
        }
        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.printf("%s.%s \n", item.getKey(), item.getValue());
        }
        System.out.println(getDataBase()[0][0]);
        System.out.println(getDataBase()[1][1]);
        int a = getDataBase().length;
        System.out.println(a);
    }


    }
