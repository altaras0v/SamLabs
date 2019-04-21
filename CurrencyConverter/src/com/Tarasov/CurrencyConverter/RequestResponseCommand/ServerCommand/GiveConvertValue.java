package com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand;

import com.Tarasov.CurrencyConverter.Client.UserRequest;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.Phone.Phone;
import com.Tarasov.CurrencyConverter.Server.Converter;

public class GiveConvertValue implements AbstractCommand {
    @Override
    public void executeResponse(Phone phone) {
        Object request = ArrayDataBase.getCurrencyMap();
        phone.writeObject(request);
        String stringRespose1 = phone.readLine();
        System.out.println(stringRespose1);
        Object response = phone.readObject();
        Converter converter = new Converter((UserRequest) response);
        converter.convert();

        request = converter.getResult();
        phone.writeObject(request);
    }
}
