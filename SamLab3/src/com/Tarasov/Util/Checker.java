package com.Tarasov.Util;

/**
 * Util class which formats values and liniarizes array
 */
public class Checker {
    /**
     * Class whichs formats money to string description
     */
    public static class Money {
        /**
         * Formats money to string description
         * @param value - value of money
         * @return value of money like a string
         */
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

    /**
     * Class which checks is value leap year or not
     */
    public static class Year {
        /**
         * Checks is value leap year or not
         * @param year - value of year
         * @return true - if it is leap year, false - if it is not leap year
         */
        public static boolean checkLeapYear(int year){
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                return true;
            }
            else {
                return false;
            }
        }
    }

    /**
     * Class which liniarizes array
     */
    public static  class  Array{
        /**
         * Liniarizes array
         * @param array - two-dimensional array
         * @return dimensional array
         */
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