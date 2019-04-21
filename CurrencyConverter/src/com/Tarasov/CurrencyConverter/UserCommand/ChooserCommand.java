package com.Tarasov.CurrencyConverter.UserCommand;

import java.io.Serializable;

/**
 * Class which creates command that client to need
 */
public class ChooserCommand implements Serializable {

    public ChooserCommand() {

    }

    /**
     * Takes parameters and choose the command depending on the params
     *
     * @param command  - number of command that client used
     * @param response - object of data that user entered and data that server response
     * @return - request object of data that user entered or null (if this command does not depend on user data)
     */
    public synchronized Object chooseCommand(int command, Object... response) {

        switch (command) {
            case 1:                                                                      // case for convert value
                new ConvertCurrencyCommand().execute(response[0]);
                return ConvertCurrencyCommand.getUserRequest();
            case 2:                                                                      // case for exchange rate
                new ExchangeRatesCommand().execute(response[0]);
                return ExchangeRatesCommand.getUserRequest();
            case 3:                                                                      // case for display result
                if (response[1] == null) new DisplayCommand().execute(response[0]);      // for exchange values
                else {
                    new DisplayCommand().execute(response[0], response[1]);              // for convert values
                }
                break;
            case 4:                                                                      // case for save result
                if (response[1] == null) new SaveToTextFileCommand().execute(response[0]);     //for exchange values
                else {
                    new SaveToTextFileCommand().execute(response[0], response[1]);             //for convert values
                }
                break;
            default:
                return null;
        }
        return null;
    }
}