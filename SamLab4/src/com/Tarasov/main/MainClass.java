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
                case "7":
                    task7();
                    break;
                case "9":
                    task9();
                    break;
                case "10":
                    task10();
                    break;
            }
        }
        task10();
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

    private static void task7() {
        String password = "eeeeeeeeee123ieekdNpee";
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$");
        Matcher m = pattern.matcher(password);

        if (m.find()==true){
            System.out.println("Yes, password is good");
        }
        else {
            System.out.println("No, password is bad");
        }
    }
    private static void task9() {
        String phoneNumber = "+375296655456";
        Pattern pattern = Pattern.compile("^((8|\\+3)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
        Matcher m = pattern.matcher(phoneNumber);
        if (m.find() == true) {
            System.out.println("Мобильный телефон корректный");
        } else {
            System.out.println("Некорректный номер телефона");
        }
    }
        private static void task10() {
            String htmlText = "foo <a href='link1'>bar</a> baz <a href='link2'>qux</a> foo";
            Pattern pattern = Pattern.compile("<a href='(.*?)'>");
            Matcher m = pattern.matcher(htmlText);
            while(m.find()) {
                System.out.println(m.group(0));
                System.out.println(m.group(1));
            }
    }
}