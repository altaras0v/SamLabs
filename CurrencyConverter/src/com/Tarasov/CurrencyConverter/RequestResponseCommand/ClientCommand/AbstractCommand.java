package com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand;

import com.Tarasov.CurrencyConverter.Phone.Phone;

interface AbstractCommand {
    void executeRequest(Phone phone);
}
