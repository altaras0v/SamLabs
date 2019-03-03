package com.Tarasov.main;

import java.util.Arrays;

public class SortOfSum {
    public static int[] sortOfSum(String s) {
        String[] substring;
        substring = s.split(" ");
        String s1 = new String();
        int j = 0;
        int[] mas = new int[substring.length];
        for (int i = 0; i < substring.length; i++) {
            int k = 0;
            int x = Integer.parseInt(substring[i]);
            while (x > 0) {
                k = k + x % 10;
                x = x / 10;

            }
            mas[j] = k;
            j++;
        }
        Arrays.sort(mas);
        return mas;
        }
}

