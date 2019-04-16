package com.Tarasov.CurrencyConverter.Command;


public class CheckCurrencyCommand implements AbstractCommand {
    static String[] array = new String[1];
    @Override
    public void execute() {

    }

    @Override
    public String[] getChoice() {
        array[0]="2";
        return array;
    }


}
