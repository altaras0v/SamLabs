package com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand;

import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.Phone.Phone;

public class GiveExchangeRates implements AbstractCommand {
    @Override
    public void executeResponse(Phone phone) {
        Object request1 = ArrayDataBase.getCurrencyMap();
        phone.writeObject(request1);
        Object response1 = phone.readObject();
        Object request2 = (ArrayDataBase.toList(response1));
        phone.writeObject(request2);
    }
}
