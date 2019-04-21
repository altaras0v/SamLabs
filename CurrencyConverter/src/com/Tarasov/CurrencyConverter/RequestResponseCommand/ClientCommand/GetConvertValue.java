package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Client.Interviewer;
import com.Tarasov.CurrencyConverter.Client.UserRequest;
import com.Tarasov.CurrencyConverter.ClientCommand.ChooserCommand;
import com.Tarasov.CurrencyConverter.ClientCommand.SaveToTextFileCommand;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.Phone.Phone;
import com.Tarasov.CurrencyConverter.Server.Converter;

public class GetConvertValue implements AbstractCommand {

    @Override
    public void executeRequest(Phone phone) {
        String stringRequest = "Get currency map";
        phone.writeLine(stringRequest);
        Object response = phone.readObject();
        System.out.println(response);

        stringRequest = "Get convert value";
        phone.writeLine(stringRequest);
        ChooserCommand command = new ChooserCommand();
        Object request1 = command.chooseCommand(1, response);
        phone.writeObject(request1);
        Object response1 = phone.readObject();
        System.out.println(response1);
        ChooserCommand command1 = new ChooserCommand();
        command1.chooseCommand(3,response1,request1);

        Interviewer.askAboutSave();
        if (Interviewer.getResult()==1) new SaveToTextFileCommand().execute(response1,request1);
    }
}
