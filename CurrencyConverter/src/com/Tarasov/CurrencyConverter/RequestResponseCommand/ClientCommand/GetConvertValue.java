package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Client.Interviewer;
import com.Tarasov.CurrencyConverter.UserCommand.ChooserCommand;
import com.Tarasov.CurrencyConverter.UserCommand.SaveToTextFileCommand;
import com.Tarasov.CurrencyConverter.Phone.Phone;

/**
 * Class for getting value after conversion
 */
public class GetConvertValue implements AbstractCommand {

    @Override
    public void executeRequest(Phone phone) {
        String stringRequest = "Give ConvertValue";                                  //string request for server
        phone.writeLine(stringRequest);
        Object response = phone.readObject();                                       // map for choosing from database
        System.out.println(response);

        stringRequest = "Give ExchangeRates";
        phone.writeLine(stringRequest);
        ChooserCommand command = new ChooserCommand();
        Object request1 = command.chooseCommand(1, response);               //Command for conversion
        phone.writeObject(request1);                                                 //UserRequest
        Object response1 = phone.readObject();                                       // List with convert values
        System.out.println(response1);
        ChooserCommand command1 = new ChooserCommand();
        command1.chooseCommand(3,response1,request1);                       //Command for display

        Interviewer.askAboutSave();
        ChooserCommand command2 = new ChooserCommand();                              //Command for save to text
        command2.chooseCommand(4,response1,request1);

    }
}
