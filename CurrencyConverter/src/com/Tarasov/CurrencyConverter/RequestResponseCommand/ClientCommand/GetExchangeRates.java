package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Client.Interviewer;
import com.Tarasov.CurrencyConverter.ClientCommand.ChooserCommand;
import com.Tarasov.CurrencyConverter.ClientCommand.SaveToTextFileCommand;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.Phone.Phone;

public class GetExchangeRates implements AbstractCommand {

    @Override
    public void executeRequest(Phone phone) {
        String stringRequest2 = "Give me DataBase";
        phone.writeLine(stringRequest2);
        Object response2 = phone.readObject();
        System.out.println(response2);
        ChooserCommand command2 = new ChooserCommand();
        Object request2 = command2.chooseCommand(2, response2);
        String s = request2.toString();
        phone.writeObject(request2); //отпр строку с выбр валютой
        ChooserCommand command3 = new ChooserCommand();
        Object response3 = phone.readObject();
        command3.chooseCommand(3,response3,null);

        Interviewer.askAboutSave();
        if (Interviewer.getResult()==1) new SaveToTextFileCommand().execute(response3);
    }
}
