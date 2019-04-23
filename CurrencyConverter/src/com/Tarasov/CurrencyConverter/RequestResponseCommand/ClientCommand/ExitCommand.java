package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Phone.Phone;

/**
 * Command fo exit
 */
public class ExitCommand implements AbstractCommand {
    /**
     * Response for exit
     * @param phone - object of phone for client
     */
    public void executeResponse(Phone phone) {
        String stringRequest3 = "Exit";
        phone.writeLine(stringRequest3);
    }

    @Override
    public void executeRequest(Phone phone) {

    }
}
