package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.Client.Interviewer;

public class ChooserCommand {
    public static String[] choice = new String[1];
    public static void chooseCommand(){
        Interviewer.getInterview();
        int command = Interviewer.getResult();
        switch (command){
            case 1:
                new ChooseValueCommand().execute();
                break;
            case 2:
            new CheckCurrencyCommand().execute();
            choice = new CheckCurrencyCommand().getChoice();
            break;
            case 4:
                new ExitCommand().execute();
            default:
                break;
        }

    }
}
