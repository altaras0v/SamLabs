package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Phone.Phone;

/**
 * Command for client
 */
interface AbstractCommand {
    void executeRequest(Phone phone);
}
