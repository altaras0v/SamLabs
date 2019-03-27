package Main;

import Tasks.L7Task1.Decoder;
import Tasks.L7Task1.Pair;
import Tasks.L7Task2.EquipmentElement;
import Tasks.L7Task2.MyArrayList;
import Tasks.L7Task2.UserElement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass7 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Parameter: " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;


            }
        }
        task1();
    }

    private static void task1() {
         List<Pair> pairList = new ArrayList<>();
        for (int i = 0;i<10;i++) {
            Pair<Integer, Character> pair = Pair.add(i, (char)('a'+i));
            pairList.add(pair);
        }
        String s = "abc";
        Decoder.stringToNumber(pairList,s);
        System.out.println();
        int a =36;
        Decoder.numberToString(pairList,a);

    }
    private static void task2() {
        Date date1 = new Date(255);
        Date date2 = new Date(128);
        UserElement userElement1 = new UserElement("ALT","First","2345678",date1);
        EquipmentElement equipmentElement = new EquipmentElement("J","106",date2);
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(userElement1);
        System.out.println(myArrayList.get(0));

    }
}