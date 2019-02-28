package com.Tarasov.Util;

public class Checker {
    public static class Money {
        public static String formatMoney(int value) {
            if (value == 1) {
                return value + " рубль";
            } else if (value > 1 && value < 5) {
                return value + " рубля";
            } else if (value > 4 && value < 21) {
                return value + " рублей";
            } else if (value > 20 && value % 10 == 0) {
                return value + " рублей";
            } else if (value > 20 && value % 10 == 1) {
                return value + " рубль";
            } else if (value > 20 && value % 10 != 0 && value % 10 != 1) {
                return value + " рубля";
            } else return null;
        }
    }
    public static class Year {
        public static String checkLeapYear(int year){
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                return "Високосный год";
            }
            else {
                return "Невисокосный год";
            }
        }
    }
    public static  class  Array{
        public static String[] linearizeArray(int[][] array) {
            String[] newArray = new String[array.length];

            for (int i = 0; i < array.length; i++) {
                newArray[i]="";
                for(int j = 0; j < array[i].length; j++) {
                    newArray[i] += array[i][j];
                }
            }
            return newArray;
        }
    }
}