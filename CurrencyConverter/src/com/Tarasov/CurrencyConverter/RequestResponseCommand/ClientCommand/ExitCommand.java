package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Phone.Phone;

import java.io.IOException;

public class ExitCommand implements AbstractCommand {

    public void executeResponse(Phone phone) {
        String stringRequest3 = "q";
        phone.writeLine(stringRequest3);
        // ChooserCommand command4= new ChooserCommand();
        //command4.chooseCommand(4,null);

    }


    @Override
    public void executeRequest(Phone phone) {

    }
}
