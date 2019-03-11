package com.Tarasov.ATM;

/**
 * Creates ATM
 */
public class ATM {
    private int numberOf20;
    private int numberOf100;
    private int numberOf50;
    private  int money = 0;
    private int allMoney;

    private final int[] nominal = {20, 50, 100};

    /**
     * Constructor of ATM
     * @param numberOf20 - number of 20  bill
     * @param numberOf50 - number of 50 bill
     * @param numberOf100 -number of 100 bill
     */
    public ATM (int numberOf20,int numberOf50,int numberOf100){
      this.numberOf20 = numberOf20;
      this.numberOf50 = numberOf50;
      this.numberOf100 = numberOf100;
      this.allMoney = numberOf20 * 20 + numberOf50 * 50 + numberOf100 * 100; // value of all money in ATM
    }

    /**
     * Take money from ATM
     * @param money - value of money that user entered
     * @return - description of output and boolean value(depends of value of money)
     */
    public boolean takeMoney(int money){
        this.money = money;
        if (money<allMoney&&money%100/20.0%1==0||money%100/50.0%1==0) {
            countMoney();
            return true;
        }
        return false;
    }

    /**
     * Count money depends on nominal
     */
    private void countMoney(){

            int[] count = new int[nominal.length];
            int index = nominal.length - 1;
            while (index != -1) {
                count[index] = money / nominal[index];
                money %= nominal[index];
                index--;
            }
            for (int i = 0; i < count.length; i++) {
                System.out.printf("Номинал в %d руб. = %d шт.\n", nominal[i], count[i]);
            }
    }
}