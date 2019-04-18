package com.Tarasov.CurrencyConverter.Command;

import com.Tarasov.CurrencyConverter.Client.Interviewer;

import java.io.Serializable;

public class ChooserCommand implements Serializable {

    public ChooserCommand(){

    }

    public synchronized Object chooseCommand(int command,Object... response){

        switch (command){
            case 1:
                new ChooseValueCommand().execute(response[0]);
                return ChooseValueCommand.getClientRequest();
               // break;
            case 2:
                new CheckCurrencyCommand().execute(response[0]);
                return CheckCurrencyCommand.getClientRequest();
                //break;
            case 3:
                if(response[1]==null) new DisplayCommand().execute(response[0]);
                else {
                    new DisplayCommand().execute(response[0], response[1]);
                }
                break;
            case 4:
                new ExitCommand().execute();
            default:
                return  null;
         //       break;
        }
        return "a";
    }
}
