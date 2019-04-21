package com.Tarasov.CurrencyConverter.ClientCommand;

import java.io.Serializable;

public class ChooserCommand implements Serializable {

    public ChooserCommand(){

    }

    public synchronized Object chooseCommand(int command,Object... response){

        switch (command){
            case 1:
                new ConvertCurrencyCommand().execute(response[0]);
                return ConvertCurrencyCommand.getUserRequest();
               // break;
            case 2:
                new ExchangeRatesCommand().execute(response[0]);
                return ExchangeRatesCommand.getUserRequest();
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
        return null;
    }
}
