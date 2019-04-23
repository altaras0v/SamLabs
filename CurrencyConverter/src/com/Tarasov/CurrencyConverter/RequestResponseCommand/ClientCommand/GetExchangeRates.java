package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Client.Interviewer;
import com.Tarasov.CurrencyConverter.UserCommand.ChooserCommand;
import com.Tarasov.CurrencyConverter.UserCommand.SaveToTextFileCommand;
import com.Tarasov.CurrencyConverter.Phone.Phone;

/**
 * Class for getting exchange rates
 */
public class GetExchangeRates implements AbstractCommand {

    @Override
    public void executeRequest(Phone phone) {
        String stringRequest2 = "Give ExchangeRates";                                     //string request for server
        phone.writeLine(stringRequest2);
        Object response2 = phone.readObject();                                          // map for choosing from database
        System.out.println(response2);
        ChooserCommand command2 = new ChooserCommand();
        Object request2 = command2.chooseCommand(2, response2);                 //Command for exchanging
       // String s = request2.toString();
        phone.writeObject(request2);                                                     //send string with choosing values
        ChooserCommand command3 = new ChooserCommand();                                  // Command for display
        Object response3 = phone.readObject();
        command3.chooseCommand(3,response3,null);

        Interviewer.askAboutSave();
        ChooserCommand command4 = new ChooserCommand();                                   //Command for save to text
        command4.chooseCommand(4,response3,null);
    }
}
