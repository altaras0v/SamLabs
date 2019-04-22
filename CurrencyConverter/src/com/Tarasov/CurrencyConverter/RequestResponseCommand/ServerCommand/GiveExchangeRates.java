package com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand;

import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.DataBase.TextFileDatabase;
import com.Tarasov.CurrencyConverter.Phone.Phone;

/**
 * Class for giving exchange rates
 */
public class GiveExchangeRates implements AbstractCommand {
    @Override
    public void executeResponse(Phone phone) {
        //Object request1 = ArrayDataBase.getCurrencyMap();                       //Database like map
        Object request1 = TextFileDatabase.getCurrencyMap();
        phone.writeObject(request1);
        Object response1 = phone.readObject();
        Object request2 = (TextFileDatabase.toList(response1));
        // Object request2 = (ArrayDataBase.toList(response1));                    //Send ExchangeRates like list
        phone.writeObject(request2);
    }
}
