package com.Tarasov.main;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Parameter: " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;
                case "2":
                    task1();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                case "5":
                    task5();
                    break;
                case "6":
                    task6();
                    break;
            }
        }
        task6();
    }

    private static void task1() {

        String s = "kazak lol";
        String[] substring;
        substring = s.split(" ");
        int k = 0;
        int length = 0;
        int fullLength = 0;
        for (int i = 0; i < substring.length; i++) {
            fullLength = fullLength + substring[i].length();
            if (Palindrom.isPalindrome(substring[i]) == true) {
                k = k + 1;
                length = length + substring[i].length();
            }
        }
        System.out.println(k);
        System.out.println(length / fullLength * 100);

    }

    private static void task2() {

        String s = "kazak";
        System.out.println(Palindrom.isPalindrome(s));

    }

    private static void task3() {

        String s = "xxxabyyyyc";
        char[] substring;
        substring = s.toCharArray();// toCharArray
        int k = 0;

        for (int i = 0; i < substring.length - 1; i++) {
            if (substring[i] == (substring[i + 1]) && substring[i + 1] == (substring[i + 2])) {
                k = k + 1;
            }
        }
        System.out.println(k);
    }

    private static void task4() {

        String s = "123 456 899 75757 04304";
        String[] substring;
        substring = s.split(" ");
        String s1 = new String();

        for (int i = 0; i < substring.length / 2; i++) {
            String temp = substring[substring.length - 1 - i];
            substring[substring.length - 1 - i] = substring[i];
            substring[i] = temp;
        }
        System.out.println(s1.join(" ", substring));
    }

    private static void task5() {

        String s = "123 456 899 75757 04304";
        String s1 = null;
        for (int i = 0; i < SortOfSum.sortOfSum(s).length; i++) {
            String s2 = String.valueOf((SortOfSum.sortOfSum(s)[i]));
            System.out.print((s1.join("", s2 + " ")));
        }
    }

    private static void task6() {
        LinkedList<String> numbers = new LinkedList<String>();
        String s = "123 цуцйууцйцуцй9 304";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher(s);
        int k = 0;
        int x;
        while (m.find()) {
           x= Integer.parseInt(m.group());
           k = k + x;
        }
        System.out.println(k);
    }
}