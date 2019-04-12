package com.Tarasov.L11.tasks;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Task2 {
    public static void task2() {

        //Function <String,String> compareFunc = (firstStr,secondStr) -> if (firstStr.l) ;
        BiFunction<String, String, String> biFunction = (a1, a2) -> a1.length() >= a2.length() ? a1 : a2;

        String s = biFunction.apply("a","aa");
        System.out.println(s);
    }

}
